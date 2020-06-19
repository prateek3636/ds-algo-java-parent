package algoexpert.btree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BranchSums {
    public static class BinaryTree{
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public static List<Integer> branchSums(BinaryTree root){
            List<Integer> myList = new ArrayList<Integer>();
            sums(myList, root, 0);
            System.out.println(Arrays.toString(myList.toArray()));
            return myList;
        }

        public static void sums(List<Integer> sumList, BinaryTree root, Integer currentSum){
            if(root == null){
                return;
            }
            Integer curSum = root.value + currentSum;

            if(root.left == null && root.right == null){
                sumList.add(curSum);
            }
            sums(sumList, root.left, curSum);
            sums(sumList, root.right, curSum);
        }
    }

    public static void main(){
        BinaryTree bt = new BinaryTree(1);
        bt.left = new BinaryTree(2);
        bt.left.left = new BinaryTree(4);
        bt.left.left.left = new BinaryTree(8);
        bt.left.left.right = new BinaryTree(9);
        bt.left.right = new BinaryTree(5);
        bt.left.right.right = new BinaryTree(10);
        bt.right = new BinaryTree(3);
        bt.right.left = new BinaryTree(6);
        bt.right.right = new BinaryTree(7);
        BranchSums.BinaryTree.branchSums(bt);
    }
}
