package com.bl.bst_uc_1_uc2_uc3;

public class BinarySearchTree<K extends Comparable<K>> {

	MyBinaryNode<K> root;

	public void add(K key) {
		this.root = addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null) {
			current = new MyBinaryNode<K>(key);
		}
		int compareResult = current.key.compareTo(key);
		if (compareResult == 0)
			return current;
		if (compareResult > 0) {
			current.left = this.addRecursively(current.left,key);
		} else {
			current.right = this.addRecursively(current.right, key);
		}
		return current;
	}

	public boolean search(K key) {
		boolean isContain = searchRecursively(this.root,key);
		return isContain;
	}

	private boolean searchRecursively(MyBinaryNode<K> current, K key) {
		if (current == null) {
			return false;
		}
		int compareResult = current.key.compareTo(key);
		if (compareResult == 0) {
			return true;
		}
		if (compareResult > 0) {
			return searchRecursively(current.left, key);
		} else {
			return searchRecursively(current.right, key);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(root);
		MyBinaryNode<K> current = root;
		while (current != null) {
			current = current.left;
			builder.insert(0, current + "<--");
		}
		current = root;
		while (current != null) {
			current = current.right;
			builder.append("-->" + current);
		}
		return builder.toString();
	}
}
