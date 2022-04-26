package com.bl.bst_uc_1_uc2_uc3;

//import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BSTTest {

	@Test
	public void addThreeNodeToBST() {

		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		System.out.println(bst); //UC1, Adding 56 then 30 and 70.
		bst.add(40);
		bst.add(22);
		bst.add(11);
		bst.add(3);
		bst.add(16);
		bst.add(95);
		bst.add(60);
		bst.add(65);
		bst.add(63);
		bst.add(67);

		System.out.println(bst);//UC2 creating the tree
		
		assertTrue(bst.search(63)); // Searching 63 in BinarySearchTree
//		assertFalse(bst.search(21));
//		assertTrue(bst.search(65));
//		assertFalse(bst.search(99));
//		assertTrue(bst.search(33));
	}

}
