import static org.junit.Assert.*;

import org.junit.Test;


public class DoublyLinkedListNodeTest {

	//create the new node
	DoublyLinkedListNode<String> myNode = new DoublyLinkedListNode<String>();
	//myNode.set
	
	
	
	@Test
	public void testPre() {
		//fail("Not yet implemented");
		//test the setpre, set data and getpre method
		DoublyLinkedListNode<String> second = new DoublyLinkedListNode<String>();
		second.setData("prepre");
		myNode.setPre(second);
		System.out.println(myNode.getPre().toString());
		assertEquals("testPre","prepre",myNode.getPre().toString());

		
	}
	
	
	
	@Test
	public void testNext() {
		//test the setNext and getnext methods
		//fail("Not yet implemented");
		DoublyLinkedListNode<String> second = new DoublyLinkedListNode<String>();
		second.setData("next");
		myNode.setNext(second);
		System.out.println(myNode.getNext().toString());
		assertEquals("testPre","next",myNode.getNext().toString());
	}
	
	

}
