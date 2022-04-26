package com.bl.hashmap;

public interface INode<K> {
	public void setKey(K key);

	public K getKey();

	public void setNext(INode<K> next);

	public INode<K>	getNext();
}
