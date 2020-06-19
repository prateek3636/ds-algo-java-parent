package algoexpert.btree;

import java.util.ArrayDeque;

public class MaxPathSum {
    public static class BinaryTree{
        int value;
        MaxPathSum.BinaryTree left;
        MaxPathSum.BinaryTree right;

        BinaryTree(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public static void getMaxPathSum(MaxPathSum.BinaryTree root){
//            getMaxPathSumFromTree(root)
        }

        private static void getMaxPathSumFromTree(MaxPathSum.BinaryTree root, int runningSum){
            if(root == null){
                return;
            }
            int currentSum = root.value;
            if(root.left !=null && root.right !=null){
                currentSum = root.left.value > root.right.value ? currentSum + root.left.value : currentSum + root.right.value;
            }else if(root.left !=null && root.right == null){
                currentSum += root.left.value;
            }else if(root.left == null && root.right !=null){
                currentSum += root.right.value;
            }
            runningSum = runningSum + currentSum;
            getMaxPathSumFromTree(root.left, runningSum);
            getMaxPathSumFromTree(root.right, runningSum);

        }

        
        

        public static void print(MaxPathSum.BinaryTree root){
            if(root == null){
                return;
            }
            System.out.println(root.value);
            print(root.left);
            print(root.right);
        }

    }

    public static void main(){
        MaxPathSum.BinaryTree bt = new MaxPathSum.BinaryTree(1);
        bt.left = new MaxPathSum.BinaryTree(2);
        bt.left.left = new MaxPathSum.BinaryTree(4);
        bt.left.left.left = new MaxPathSum.BinaryTree(8);
        bt.left.left.right = new MaxPathSum.BinaryTree(9);
        bt.left.right = new MaxPathSum.BinaryTree(5);
        bt.left.right.right = new MaxPathSum.BinaryTree(10);
        bt.right = new MaxPathSum.BinaryTree(3);
        bt.right.left = new MaxPathSum.BinaryTree(6);
        bt.right.right = new MaxPathSum.BinaryTree(7);
        MaxPathSum.BinaryTree.print(bt);

        MaxPathSum.BinaryTree.getMaxPathSum(bt);
        System.out.println("---------------");
        MaxPathSum.BinaryTree.print(bt);

    }
}
