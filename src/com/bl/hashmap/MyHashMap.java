package com.bl.hashmap;

public class MyHashMap<K, V> {
	MyLinkedList<K> myLinkedList;

	public MyHashMap() {
		myLinkedList = new MyLinkedList<>();
	}

	public void add(K key, V value) {
		@SuppressWarnings("unchecked")
		MyMapNode<K, V> newNode = (MyMapNode<K, V>) myLinkedList.search(key);
		if (newNode == null) {
			newNode = new MyMapNode<K, V>(key, value);
			myLinkedList.append(newNode);
		} else {
			newNode.setValue(value);
		}
	}

	public V get(K key) {
		@SuppressWarnings("unchecked")
		MyMapNode<K, V> myMapNode = ((MyMapNode<K, V>) myLinkedList.search(key));
		return myMapNode == null ? null : myMapNode.getValue();
	}

	public int size() {
		return myLinkedList.size();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public String toString() {
		return myLinkedList.toString();
	}
}
