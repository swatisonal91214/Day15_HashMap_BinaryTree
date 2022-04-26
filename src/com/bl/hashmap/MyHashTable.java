package com.bl.hashmap;

public class MyHashTable<K, V> {

	int bucketSize;
	MyLinkedList<K>[] myBucketList;

	@SuppressWarnings("unchecked")
	public MyHashTable(int bucketSize) {
		this.bucketSize = bucketSize;
		myBucketList = new MyLinkedList[bucketSize];
	}

	public void add(K key, V value) {
		int bucketIndex = Math.abs(key.hashCode() % bucketSize);
		if (myBucketList[bucketIndex] == null) {
			myBucketList[bucketIndex] = new MyLinkedList<>();
		}
	
		@SuppressWarnings("unchecked")
		MyMapNode<K, V> nodeObj = (MyMapNode<K, V>) myBucketList[bucketIndex].search(key);
		if (nodeObj == null) {
			nodeObj = new MyMapNode<K, V>(key, value);
			myBucketList[bucketIndex].append(nodeObj);
		} else {
			nodeObj.setValue(value);
		}
	}

	public V get(K key) {
		int bucketIndex = Math.abs(key.hashCode() % bucketSize);
		if (myBucketList[bucketIndex] == null) {
			myBucketList[bucketIndex] = new MyLinkedList<>();
		}
		@SuppressWarnings("unchecked")
		MyMapNode<K, V> node = ((MyMapNode<K, V>) myBucketList[bucketIndex].search(key));
		return node == null ? null : node.getValue();
	}

	public void printAllList() {
		for (int i = 0; i < myBucketList.length; i++) {
			if (myBucketList[i] != null) {
				System.out.println("BucketIndex : " + i
						+ " : " + myBucketList[i].size()
						+ " :" + myBucketList[i]);
			}
		}
	}

	public MyMapNode<K, V> remove(K key) {
		int bucketIndex = Math
				.abs(key.hashCode() % bucketSize);
		@SuppressWarnings("unchecked")
		MyMapNode<K, V> searchNode = (MyMapNode<K, V>) myBucketList[bucketIndex].search(key);
		if (searchNode == null) {
			return null;
		} else {
			myBucketList[bucketIndex].remove(searchNode);
			return searchNode;
		}
	}

	public int size() {
		int size = 0;
		for (MyLinkedList<K> myLinkedList : myBucketList) {
			if (myLinkedList != null)
				size += myLinkedList.size();
		}
		return size;
	}

	public boolean isEmpty() {
		boolean flag = true;

		for (MyLinkedList<K> myLinkedList : myBucketList) {
			if (myLinkedList != null)
				flag = flag && myLinkedList.isEmpty();
		}

		return flag;
	}
}
