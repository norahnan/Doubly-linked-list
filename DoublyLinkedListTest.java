import static org.junit.Assert.*;

import org.junit.Test;


public class DoublyLinkedListTest {

	
	private DoublyLinkedList<String> myList = new DoublyLinkedList<String>();

	//test the method isEmpty
	@Test
	public void testisEmpty() {
		//fail("Not yet implemented");
		
		assertEquals("testisEmpty",true ,myList.isEmpty());
		myList.insertFirst("first");
		assertEquals("testisEmpty",false ,myList.isEmpty());
		myList.deleteFirst();
		assertEquals("testisEmpty",true ,myList.isEmpty());

		
	}
	
	
	@Test
	public void testinsertFirst() {
		//fail("Not yet implemented");
		myList.insertFirst("first");
		//System.out.println(myList.search("first").toString());
		//System.out.println("this is the new list:  " + myList.toString());
		assertEquals("testinsertFirst","first",myList.toString());
		myList.insertFirst("firstnew");
		assertEquals("testinsertFirst","firstnew <-> first",myList.toString());
		//System.out.println("this is the new list:  " + myList.toString());
		
	}
	
	@Test
	public void testinsertAfter() {
		myList.insertFirst("first");
		//System.out.println("this is first node" + myList.getFirstNode().getData());
		myList.insertAfter(myList.getFirstNode(), "second thing");
		myList.insertAfter(myList.getFirstNode().getNext(), "second2222 thing");
		myList.insertAfter(myList.getFirstNode(), "second2222 thing");

		//System.out.println("this is the new list:  " + myList.toString());
		assertEquals("testinsertAfter","first <-> second2222 thing <-> second thing <-> second2222 thing",myList.toString());
		
		System.out.println("this is the new list:  " + myList.toString());
		//assertEquals("testinsertAfter","first <-> second thing",myList.toString());
		

		//fail("Not yet implemented");
	}
	
	@Test
	public void testinsertLast() {
		//myList.insertLast("last/second");

		myList.insertFirst("first");
		myList.insertFirst("first1");
		myList.insertLast("last/second222");

		//System.out.println("new list:  " + myList.toString());
		assertEquals("testinsertLast","first1 <-> first <-> last/second222",myList.toString());

		
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testdeleteLast() {
		//fail("Not yet implemented");
		myList.insertFirst("first");
		myList.insertFirst("first2");

		myList.deleteLast();
		//System.out.println("this is the new list:  " + myList.toString());
		assertEquals("testdeleteLast","first2",myList.toString());

	}
	
	@Test
	public void testdeleteFirst() {
		//fail("Not yet implemented");
		myList.insertFirst("first");
		myList.insertFirst("first2");
	
		myList.deleteFirst();
		//System.out.println("this is the new list:  " + myList.toString());
		assertEquals("testdeleteFirst","first",myList.toString());
	
		
	}
	
	@Test
	public void testdeleteNext() {
		//fail("Not yet implemented");
		myList.insertFirst("first");
		myList.insertFirst("first2");
		//System.out.println("This 1 node2: " + myList.getFirstNode().getNext().getData());
		myList.deleteNext(myList.getFirstNode());
		//System.out.println("this is the new list:  " + myList.toString());
		assertEquals("testdeleteNext","first2",myList.toString());

	}
	
	

}
