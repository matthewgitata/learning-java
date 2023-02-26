package com.matthewgitata.learningjava.binarytree;

public class BinarySearchTree {
    TreeNode root;

    public void insert(Integer data) {
        if (root == null) {
            this.root = new TreeNode(data);
        } else {
            this.root.insert(data);
        }
    }

    public Integer smallest() {
        if (this.root != null) {
            return this.root.smallest();
        } else {
            return null;
        }
    }

    public Integer largest() {
        if (this.root != null) {
            return this.root.largest();
        } else {
            return null;
        }
    }

    public TreeNode find(Integer data) {
        if (root != null) {
            root.find(data);
        }
        return null;
    }

    public void inOrder() {
        if (this.root != null) {
            root.inOrder();
        }
    }

    public void preOrder() {
        if (this.root != null) {
            root.preOrder();
        }
    }

    public void postOrder() {
        if (this.root != null) {
            root.postOrder();
        }
    }

    public void delete(Integer data) {
        TreeNode toDel = find(data);
        toDel.delete();
    }

//    public void delete(Integer data) {
//        TreeNode current = this.root;
//        TreeNode parent = this.root;
//        boolean isLeftChild = false;
//
//        if (current == null) {
//            return;
//        }
//        while (current != null && current.getData() != data) {
//            parent = current;
//            if (data < current.getData()) {
//                current = current.getLeftChild();
//                isLeftChild = true;
//            } else {
//                current = current.getRightChild();
//                isLeftChild = false;
//            }
//        }
//        if (current == null) {
//            return;
//        }
//
//        if (current.getLeftChild() == null && current.getRightChild() == null) {
//            if (current == this.root) {
//                this.root = null;
//            } else {
//                if (isLeftChild) {
//                    parent.setLeftChild(null);
//                } else {
//                    parent.setRightChild(null);
//                }
//            }
//        } else if (current.getRightChild() == null) {
//            if (current == this.root) {
//                this.root = current.getLeftChild();
//            } else if (isLeftChild) {
//                parent.setLeftChild(current.getLeftChild());
//            } else{
//                parent.setRightChild(current.getLeftChild());
//            }
//        } else if (current.getLeftChild() == null) {
//            if (current == this.root) {
//                this.root = current.getRightChild();
//            } else if (isLeftChild) {
//                parent.setLeftChild(current.getRightChild());
//            } else{
//                parent.setRightChild(current.getRightChild());
//            }
//        }
//    }
}