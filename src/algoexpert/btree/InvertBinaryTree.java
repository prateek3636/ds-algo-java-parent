package algoexpert.btree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InvertBinaryTree {
    public static class BinaryTree{
        int value;
        InvertBinaryTree.BinaryTree left;
        InvertBinaryTree.BinaryTree right;

        BinaryTree(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public static void invertTreeUsingRec(BinaryTree root){
            if(root == null){
                return;
            }
            swap(root);
            invertTreeUsingRec(root.right);
            invertTreeUsingRec(root.left);
        }

        public static void invertTreeUsingSeq(BinaryTree root){
            ArrayDeque<BinaryTree> queue = new ArrayDeque<>();
            queue.add(root);
            while(queue.size()>0){
                BinaryTree polledElm = queue.poll();
                if(polledElm == null){
                    continue;
                }
                swap(polledElm);
                if(polledElm.left != null)
                queue.add(polledElm.left);
                if(polledElm.right != null)
                queue.add(polledElm.right);
            }
        }

        private static void swap(BinaryTree polledElm) {
            BinaryTree bt = polledElm.left;
            polledElm.left = polledElm.right;
            polledElm.right = bt;
        }

        public static void print(BinaryTree root){
            if(root == null){
                return;
            }
            System.out.println(root.value);
            print(root.left);
            print(root.right);
        }

    }

    public static void main(){
        InvertBinaryTree.BinaryTree bt = new InvertBinaryTree.BinaryTree(1);
        bt.left = new InvertBinaryTree.BinaryTree(2);
        bt.left.left = new InvertBinaryTree.BinaryTree(4);
        bt.left.left.left = new InvertBinaryTree.BinaryTree(8);
        bt.left.left.right = new InvertBinaryTree.BinaryTree(9);
        bt.left.right = new InvertBinaryTree.BinaryTree(5);
        bt.left.right.right = new InvertBinaryTree.BinaryTree(10);
        bt.right = new InvertBinaryTree.BinaryTree(3);
        bt.right.left = new InvertBinaryTree.BinaryTree(6);
        bt.right.right = new InvertBinaryTree.BinaryTree(7);
        InvertBinaryTree.BinaryTree.print(bt);

        InvertBinaryTree.BinaryTree.invertTreeUsingSeq(bt);
        System.out.println("---------------");
        InvertBinaryTree.BinaryTree.print(bt);

    }
}

//1
//        3
//        7
//        6
//        2
//        5
//        10
//        4
//        9
//        8