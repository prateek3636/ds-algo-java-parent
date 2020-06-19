package algoexpert.btree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLowestCommonAncestor {

    public static class BinaryTree{
        int value;
        FindLowestCommonAncestor.BinaryTree left;
        FindLowestCommonAncestor.BinaryTree right;

        BinaryTree(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public static void print(FindLowestCommonAncestor.BinaryTree root){
            if(root == null){
                return;
            }
            System.out.println(root.value);
            print(root.left);
            print(root.right);
        }


        public int findLowestCommonAncestor(int v1, int v2, FindLowestCommonAncestor.BinaryTree root){
            if( root == null){
                return 0;
            }

            if ( v1 > root.value && v2 > root.value ){
                return findLowestCommonAncestor(v1, v2, root.right);
            }

            if ( v1 < root.value && v2 < root.value ){
                return findLowestCommonAncestor(v1, v2, root.left);
            }

            return root.value;

        }

    }

    public static void main(){
        FindLowestCommonAncestor.BinaryTree bt = new FindLowestCommonAncestor.BinaryTree(6);
        bt.left = new FindLowestCommonAncestor.BinaryTree(5);
        bt.right = new FindLowestCommonAncestor.BinaryTree(10);
        bt.right.left = new FindLowestCommonAncestor.BinaryTree(9);
        bt.right.right = new FindLowestCommonAncestor.BinaryTree(15);
        bt.right.right.right = new FindLowestCommonAncestor.BinaryTree(17);
        FindLowestCommonAncestor.BinaryTree.print(bt);
        int r = bt.findLowestCommonAncestor(9, 17, bt);

        System.out.println(r);
    }

}
