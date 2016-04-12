import static org.junit.Assert.*;

import org.junit.Test;


public class LinkedListTest {

	@Test
	public void test234() {
		fail("Not yet implemented");
	}
	
private LinkedList<String> thisList = new LinkedList<String>();
	
	/**Insert "a" at the beginning of the list**/
	@Test
	public void test() {
		
		thisList.insertFirst("a");
		System.out.println(thisList.toString());
		fail("Not yet implemented");
	}
	
	@Test
	/**Insert "a" at the beginning of the list
	 * Insert "v" at the beginning of the list
	 * Insert "a" at the beginning of the list**/

	public void test1() {
		
		thisList.insertFirst("a");
		thisList.insertFirst("v");
		
		System.out.println(thisList.toString());
		fail("Not yet implemented");
	}
	@Test
	/**Insert "a" at the beginning of the list
	 * Insert "v" at the beginning of the list
	 * Insert "a" at the beginning of the list**/

	public void test2() {
		
		thisList.insertFirst("a");
		thisList.insertFirst("v");
		thisList.insertFirst("a");

		System.out.println(thisList.toString());
		fail("Not yet implemented");
	}
	
	@Test
	/**Insert "a" at the beginning of the list
	 * Insert "v" at the beginning of the list
	 * Insert "a" at the beginning of the list
	 *  Insert "l" at the beginning of the list**/

	public void test3() {
		
		thisList.insertFirst("a");
		thisList.insertFirst("v");
		thisList.insertFirst("a");
		thisList.insertFirst("l");

		System.out.println(thisList.toString());
		fail("Not yet implemented");
	}
	
	
	@Test
	/**Insert "a" at the beginning of the list
	 * Insert "v" at the beginning of the list
	 * Insert "a" at the beginning of the list
	 *  do what is done in the former test
	 *  Insert "o" at the beginning of the list**/

	public void test4() {
		
		thisList.insertFirst("a");
		thisList.insertFirst("v");
		thisList.insertFirst("a");
		thisList.insertFirst("l");
		thisList.insertFirst("o");

		System.out.println(thisList.toString());
		fail("Not yet implemented");
	}

	
	@Test
	/**Insert "a" at the beginning of the list
	 * Insert "v" at the beginning of the list
	 * Insert "a" at the beginning of the list
	 *  do what is done in the former test
	 *  Insert "i" at the beginning of the list**/

	public void test5() {
		
		thisList.insertFirst("a");
		thisList.insertFirst("v");
		thisList.insertFirst("a");
		thisList.insertFirst("l");
		thisList.insertFirst("o");
		thisList.insertFirst("i");

		System.out.println(thisList.toString());
		fail("Not yet implemented");
	}
	
	@Test
	/**Insert "a" at the beginning of the list
	 * Insert "v" at the beginning of the list
	 * Insert "a" at the beginning of the list
	 *  do what is done in the former test
	 *  Insert "j" after the node following the head node**/

	public void test6() {
		
		thisList.insertFirst("a");
		thisList.insertFirst("v");
		thisList.insertFirst("a");
		thisList.insertFirst("l");
		thisList.insertFirst("o");
		thisList.insertFirst("i");
		thisList.insertAfter(thisList.getFirstNode().getNext(), "j");
		System.out.println(thisList.toString());
		fail("Not yet implemented");
	}
	
	@Test
	/**Insert "a" at the beginning of the list
	 * Insert "v" at the beginning of the list
	 * Insert "a" at the beginning of the list
	 *  do what is done in the former test
	 *  Insert "e" after the node following the head node**/

	public void test7() {
		
		thisList.insertFirst("a");
		thisList.insertFirst("v");
		thisList.insertFirst("a");
		thisList.insertFirst("l");
		thisList.insertFirst("o");
		thisList.insertFirst("i");
		thisList.insertAfter(thisList.getFirstNode().getNext(), "j");
		thisList.insertAfter(thisList.getFirstNode().getNext(), "e");

		System.out.println(thisList.toString());
		fail("Not yet implemented");
	}

	
	@Test
	/**Insert "a" at the beginning of the list
	 * Insert "v" at the beginning of the list
	 * Insert "a" at the beginning of the list
	 *  do what is done in the former test
	 *  Insert "v" after the node following the head node**/

	public void test8() {
		
		thisList.insertFirst("a");
		thisList.insertFirst("v");
		thisList.insertFirst("a");
		thisList.insertFirst("l");
		thisList.insertFirst("o");
		thisList.insertFirst("i");
		thisList.insertAfter(thisList.getFirstNode().getNext(), "j");
		thisList.insertAfter(thisList.getFirstNode().getNext(), "e");
		thisList.insertAfter(thisList.getFirstNode().getNext(), "v");

		System.out.println(thisList.toString());
		fail("Not yet implemented");
	}
	
	@Test
	/**Insert "a" at the beginning of the list
	 * Insert "v" at the beginning of the list
	 * Insert "a" at the beginning of the list
	 *  do what is done in the former test
	 *  Delete the node after the node after the node 
	 *  after the node after the node after the head node**/

	public void testLast() {
		
		thisList.insertFirst("a");
		thisList.insertFirst("v");
		thisList.insertFirst("a");
		thisList.insertFirst("l");
		thisList.insertFirst("o");
		thisList.insertFirst("i");
		thisList.insertAfter(thisList.getFirstNode().getNext(), "j");
		thisList.insertAfter(thisList.getFirstNode().getNext(), "e");
		thisList.insertAfter(thisList.getFirstNode().getNext(), "v");
		thisList.insertAfter(thisList.getFirstNode(), "l");
		thisList.deleteNext(thisList.getFirstNode()
				.getNext().getNext().getNext().getNext());
		System.out.println(thisList.toString());
		fail("Not yet implemented");
	}
	
	@Test
	/**Insert "a" at the beginning of the list
	 * Insert "v" at the beginning of the list
	 * Insert "a" at the beginning of the list
	 * do what is done in the former test
	 * Insert "l" after the head node**/

	public void test9() {
		
		thisList.insertFirst("a");
		thisList.insertFirst("v");
		thisList.insertFirst("a");
		thisList.insertFirst("l");
		thisList.insertFirst("o");
		thisList.insertFirst("i");
		thisList.insertAfter(thisList.getFirstNode().getNext(), "j");
		thisList.insertAfter(thisList.getFirstNode().getNext(), "e");
		thisList.insertAfter(thisList.getFirstNode().getNext(), "v");
		thisList.insertAfter(thisList.getFirstNode(), "l");

		System.out.println(thisList.toString());
		fail("Not yet implemented");
	}
	

}
