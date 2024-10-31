package com.ks.ksfinal.util;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public interface MapOfMap<K1,K2,V,M extends Map<K2,V>> extends Map<K1,M>
{
	M newK2VMap();
	
	default V get (K1 k1, K2 k2) {
		M k2vMap = get(k1);
		if(k2vMap==null) {
			return null;
		}
		return k2vMap.get(k2);
	}
	
	default V put(K1 k1, K2 k2, V v) {
		M k2vMap = get(k1);
		if(k2vMap==null) {
			k2vMap = newK2VMap();
			put(k1, k2vMap);
		}
		k2vMap.put(k2,v);
		return k2vMap.put(k2,v);
	}
	
	default V delete(K1 k1, K2 k2) {
		M k2vMap = get(k1);
		if(k2vMap!=null) {
			V deleted = k2vMap.remove(k2);
			if(k2vMap.isEmpty()) {
				remove(k1);
			}
			return deleted;
		}
		return null;
	}
	
	public static class HH<K1, K2, V> extends HashMap<K1, HashMap<K2, V>> implements MapOfMap<K1, K2, V, HashMap<K2, V> > {
		private static final long serialVersionUID = 1L;
		
		@Override
		public HashMap<K2, V> newK2VMap() {
			return new HashMap<K2, V>();
		}
	}

	public static class TT<K1, K2, V> extends TreeMap<K1, TreeMap<K2, V>> implements MapOfMap<K1, K2, V, TreeMap<K2, V> > {
		private static final long serialVersionUID = 1L;
		
		@Override
		public TreeMap<K2, V> newK2VMap() {
			return new TreeMap<K2, V>();
		}
	}
}