package org.com.covid;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

	private String test="Test Display";
	
	private Map<Integer, String> conMap = new ConcurrentHashMap<>();
	private Map<Integer, String> hashMap = new HashMap<>();
	
	
	
	
	public static void main(String[] args) {
		
		Test t= new Test();
		t.conMap.put(1, "Hash1");
		t.conMap.put(2, "Hash2");
		
		t.hashMap.put(1, "Con1");
		t.hashMap.put(2, "Con2");
		
		
		Map<Integer, String> m = new ConcurrentHashMap<>();
		m.putAll(t.conMap);
		
		
		System.out.println(t.test);
		System.out.println(t.conMap);
		System.out.println(t.hashMap);
		System.out.println(m);
		
}

}
