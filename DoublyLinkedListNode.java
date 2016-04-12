
public class DoublyLinkedListNode<T> extends LinkedListNode<T>{

	private DoublyLinkedListNode<T> previous;
	//private DoublyLinkedListNode<T> next;

	public void setPre(DoublyLinkedListNode<T> myNude)
	{
		previous = myNude;
	}
	
	public DoublyLinkedListNode<T> getPre()
	{
		return previous;
	}
	
	 
	public DoublyLinkedListNode<T> getNext()
	{
		return (DoublyLinkedListNode<T>) next;
	}
	
	
	 
	
	 
	/**
	 * Set the next pointer to passed node.
	 **/
	public void setNext( DoublyLinkedListNode<T> node )
	{
		next = node;
	}
	
}
