package com.bl.bst_uc_1_uc2_uc3;

public class MyBinaryNode<K> implements  INode<K>{

	public K key;
	public MyBinaryNode<K> left;
	public MyBinaryNode<K> right;
	

	public MyBinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public MyBinaryNode<K> getLeft() {
		return left;
	}

	@Override
	public void setLeft(MyBinaryNode<K> left) {
		this.left = left;
	}

	@Override
	public MyBinaryNode<K> getRight() {
		return right;
	}

	@Override
	public void setRight(MyBinaryNode<K> right) {
		this.right = right;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyBinaryNode{key=" + key + "}");

		if (left != null) {
			builder.insert(0, "MyBinaryNode{key=" + left.key
					+ "}<--");
		}
		if (right != null) {
			builder.append("-->MyBinaryNode{key="
					+ right.key + "}");
		}

		return builder.toString();
	}
}