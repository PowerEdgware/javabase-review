package com.JCF.common;

import java.util.LinkedHashMap;

/**
 * 基于{@@link LinkedHashSet}的LRU Cache
 * 
 * @author shangcj
 *
 * @param <K,V>
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2252955744369670644L;
	static final int DEFAULT_MAX_ENTRIES = 200;

	final int MAX_ENTRIES;

	public LRUCache() {
		this(DEFAULT_MAX_ENTRIES);
	}

	public LRUCache(int maxEntries) {
		super(16, .75f, true);
		if (maxEntries <= 0) {
			throw new IllegalArgumentException("maxEntries<=0");
		}
		this.MAX_ENTRIES = maxEntries;
	}

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return super.size() > MAX_ENTRIES;
	}

}
