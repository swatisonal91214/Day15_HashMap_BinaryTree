package com.bl.bst_uc_1_uc2_uc3;

public interface INode<K> {
	
	public K getKey();
	public void setKey(K key);
	public MyBinaryNode<K> getLeft();
	public void setLeft(MyBinaryNode<K> left);
	public MyBinaryNode<K> getRight();
	public void setRight(MyBinaryNode<K> right);

}
