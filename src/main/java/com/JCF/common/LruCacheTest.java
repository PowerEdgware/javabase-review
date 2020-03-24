package com.JCF.common;

public class LruCacheTest {

	public static void main(String[] args) {
		int maxEntries=10;
		LRUCache<Integer,Integer> cache=new LRUCache<>(maxEntries);
		
		for (int i = 0; i <maxEntries+5; i++) {
			cache.put(i, i);
		}
		System.out.println(cache.size());
		System.out.println(cache);
	}
}
