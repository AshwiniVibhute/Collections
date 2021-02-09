package com.qa.ListInterface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(101, "Devaansh");
		hm.put(102, "Pihu");
		hm.put(103, "Ayush");
		hm.put(104, "Savee");
		hm.put(105, "Ovee");
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.isEmpty());
		System.out.println(hm.get(103));
		System.out.println(hm.containsKey(101));
		System.out.println(hm.containsValue("Savee"));
		
		 System.out.println("Using for each loop");
		 
		Set<Entry<Integer,String>> mes=hm.entrySet();
		 for (Map.Entry<Integer, String> ent:mes) {
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		 System.out.println("using iterator");
		Set es=hm.entrySet();
		
		Iterator tr=es.iterator();
		
		while (tr.hasNext()) {
		Map.Entry ehm=(Entry) tr.next();
			System.out.println(ehm.getKey()+" "+ehm.getValue());
		}

	}

}
