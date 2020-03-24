package com.JCF.map;

import java.util.HashMap;
import java.util.Map;

public class MapReadme<K, V> extends HashMap<K, V> {

	//TODO 不在同一个包内，不能重写
	void afterNodeAccess(Map.Entry<K,V> entry) {
		System.out.println("Aaa");
	}

	void readme() {
		// Map
		// 实现：HashMap,TreeMap,LinkedHashMap,Hashtable,WeakHashMap
		// HashSet TreeSet
		//PhantomReference
		//ThreadLocal
		//Thread
		//并发：ConcurrentHashMap,ConcurrentSkipListMap
		//
	}

	public static void main(String[] args) {
		MapReadme<String, String> x=new MapReadme<>();
		x.put("x", "x");
		x.put("x", "y");
		
		System.out.println(Integer.toBinaryString(1<<15));
	}

	static final int MAXIMUM_CAPACITY = 1 << 30;

	// 先求一个数的掩码 在加一即可
	static final int tableSizeFor(int cap) {
		int n = cap - 1;
		n |= n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;
		return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
	}
}
