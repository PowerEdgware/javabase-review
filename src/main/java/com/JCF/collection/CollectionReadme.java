package com.JCF.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class CollectionReadme {

	void readme() {
		// Collection
		// List Set Queue
		//List ArrayList,LinkedList,Vector[Stack],CopyOnWriteArrayList
		
		//Queue 
		// LinkedList ArrayDeque PriorityQueue
		
		// AbstractSet 

		ArrayList<String> arrList = null;
		// arrList.sort(c);

		LinkedList<String> linkedList = null;
		
		Comparator<String> c = (s1, s2) -> {
			return ((String) s1).compareTo((String) s2);
		};
		linkedList.sort(c);
		
		// Map
		//
	}
}
