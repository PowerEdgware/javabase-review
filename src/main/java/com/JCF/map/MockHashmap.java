package com.JCF.map;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//unmodifiable map
public class MockHashmap<K, V> extends AbstractMap<K, V> {

	transient int size;

	transient Set<Entry<K, V>> entrySet;

	// provide a void constructor and a map constructor
	public MockHashmap() {

	}
	
	public MockHashmap(Map<? extends K,? extends V> m){
		//...
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		Set<Entry<K, V>> es;
		return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
	}

	final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
		@Override
		public Iterator<Entry<K, V>> iterator() {
			return null;
		}

		@Override
		public int size() {
			return 0;
		}
	}

}
