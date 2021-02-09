package com.qa.ListInterface;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SampleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls=  new ArrayList<String>();
		ls.add("Ashu");
		ls.add("Pradnya");
		ls.add("Karan");
		
		boolean b=ls.isEmpty();
		System.out.println("Is list empty-->"+b);
		
		int numberOfElement= ls.size();
		System.out.println("Size of the list-->"+numberOfElement);
		//using for loop
		for(String itr: ls)
		{
			System.out.println("Elements in List using for loop-->"+itr);
		}
		
		//using Iterator interface

		Iterator<String> iter=ls.iterator();
		while (iter.hasNext()) {
			String ele=iter.next();
		System.out.println("Element in the List using Iterator interface-->"+ele);
			
		}
		
		//traversing list using ListIterator in forward direction
		ListIterator<String> listItr=ls.listIterator();
		System.out.println("Traversing element in forward direction");
		while (listItr.hasNext()) {
			String eleNxt=listItr.next();
		System.out.println("Index:"+listItr.nextIndex()+" "+"value is:"+ eleNxt);
		}
		////traversing list using ListIterator in backword direction
		
		while (listItr.hasPrevious()) {
			String elePre=listItr.previous();
		System.out.println("Index:"+listItr.previousIndex()+" "+"value is:"+ elePre);
		}
		
		System.out.println("Element on index 2-->"+ls.get(2));
		ls.remove(1);
	
		int hc=ls.hashCode();
		System.out.println("Hascode value for a list-->"+hc);
		boolean p=ls.contains("Ashu");
		System.out.println("Is Ashu present in the list-->"+p);
		
	}

}
