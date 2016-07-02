package com.goit.g2popov.module11.module05.task02;

/**
 * Class {@code SortArray} realizes two algorithms of array sorting:
 * 1) Bubbles sorting
 * 2) Binary tree sorting
 * @author Andrii Popov
 */

public class SortArray implements Sorting {

        // An array to be sorted
        private int anArray[];

        // Counter of three nodes (needed for Binary tree sorting to obtain the sorted array)
        private static int counter = 0;

        public SortArray (int inputArray[]) {
             this.anArray = inputArray.clone();
        }

        public int[] getAnArray() {
                return anArray;
        }

        // Classic Bubbles sorting
        public void sortArray () {
                int arrayLength = this.anArray.length;
                for (int i = arrayLength; i > 0; i--) {
                        for (int j = 0; j < i-1; j++) {
                                if (anArray[j+1]<anArray[j]) {
                                        int tempVariable = anArray[j];
                                        anArray[j] = anArray[j+1];
                                        anArray[j+1] = tempVariable;
                                }
                        }
                }
        }

        /**
         * Exquisite binary tree sorting
         */
        public void sortArrayBinaryTree() {
                TreeNode rootNode = createNode(0, anArray[0]);
                int arrayLength = this.anArray.length;

                // Go through the array to get elements and build a Binary Tree
                for (int i = 1; i<arrayLength; i++) {
                        createSubTree(i, anArray[i], rootNode);
                }

                // Traverse the tree to output the elements in a sorted order from min to max
                traverseTree(rootNode);
        }

        /**
         * Creates a new tree node
         * @param id
         * @param value
         * @return a new node
         */
        private TreeNode createNode(int id, int value) {
                TreeNode rootNode = new TreeNode(id, value);
                return rootNode;
        }

        /**
         * Recursive method to create all the nodes fo the binary tree
         * @see Binary Tree Sorting
         * @param arrayId
         * @param arrayValue
         * @param root
         */
        private void createSubTree(int arrayId, int arrayValue, TreeNode root) {

                // Analyze where to insert a new array's element
                // Compare it with the current root value
                // If less - insert to the left, otherwise - to the right
                if (arrayValue <= root.value) {
                        if (root.left == null) {
                                TreeNode leftNode = createNode(arrayId, arrayValue);
                                root.left = leftNode;
                        }
                        else {
                                root = root.left;
                                createSubTree(arrayId, arrayValue, root);
                        }
                }
                else {
                        if (root.right == null) {
                                TreeNode rightNode = createNode(arrayId, arrayValue);
                                root.right = rightNode;
                        }
                        else {
                                root = root.right;
                                createSubTree(arrayId, arrayValue, root);
                        }
                }
        }

        /**
         * Recursive method to traverse the tree in the manner: left subtree - parent - right subtree
         * @param node
         */
        private void traverseTree(TreeNode node) {
                if (node.left != null) traverseTree(node.left);
                anArray[counter] = node.value;
                counter++;
                if (node.right != null) traverseTree(node.right);
        }

        @Override
        public String toString() {
                String arrayString = "";
                for (int i = 0; i<anArray.length; i++) {
                        arrayString = arrayString + anArray[i]+" ";
                }
                return arrayString;
        }
}

/**
 * Class {@code TreeNode} emulates a tree node
 * @author Andrii Popov
 */
class TreeNode {
        int id;
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int id, int value) {
                this.id = id;
                this.value = value;
        }
}
