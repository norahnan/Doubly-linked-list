
public class DoublyLinkedList<T> extends LinkedList<T> {

	private DoublyLinkedListNode<T> tail;
	//private DoublyLinkedListNode<T> head;

	/**
	 * Insert a new node with data at the head of the list.
	 **/
	public void insertFirst( T data )
	{
		//create a new nude in the list
		DoublyLinkedListNode<T> newNude = new DoublyLinkedListNode<T>();
		//set the data
		newNude.setData(data);
		if (head != null)
		{
			
			//set next to head
			newNude.setNext(head);
			
			//set previous to null
			newNude.setPre(null);
			//update the previous pointer of the head
			((DoublyLinkedListNode<T>) head).setPre(newNude);
			//update the head
			head = newNude;
		}
		if(tail == null)
		{
			tail = newNude;
			head = newNude;
		}
		
			
		
		//update the tail
		
		DoublyLinkedListNode<T> lastNude = new DoublyLinkedListNode<T>();
		lastNude = (DoublyLinkedListNode<T>) head;
		while (lastNude.getNext()!=null)
		{
			lastNude= lastNude.getNext();
		}
		if (lastNude.getPre()!=null)
		{
			lastNude.getPre().setNext(lastNude);
		}
		tail = lastNude;

	}
	
	/**
	 * Get the head node of the list.
	 **/
	public DoublyLinkedListNode<T> getFirstNode()
	{
		return (DoublyLinkedListNode<T>) head;
	}
	
	
	/**
	 * Insert a new node with data after currentNode
	 **/
	public void insertAfter( DoublyLinkedListNode<T> currentNode, T data )
	{
		//create a new nude
		DoublyLinkedListNode<T> newNude = new DoublyLinkedListNode<T>();
		 //set the data
		 newNude.setData(data);
		 
		 if (currentNode.getNext()==null)
		 {
			 newNude.setPre(currentNode);
			 newNude.setNext(null);
			 currentNode.setNext(newNude);
			 tail.setNext(newNude);
			 tail = newNude;
		 }
		 
		 else
		 {
			//set the next of the original and the new nude
			 newNude.setNext(currentNode.getNext());
			 currentNode.setNext(newNude);
			 //set previous of the new nude
			 newNude.setPre(currentNode);
			 //set previous of the one after the current node
			 currentNode.getNext().setPre(newNude);
			 
			 
			//update the tail
			DoublyLinkedListNode<T> lastNude = new DoublyLinkedListNode<T>();
			lastNude = (DoublyLinkedListNode<T>) head;
			while (lastNude.getNext()!=null)
			{
				lastNude= lastNude.getNext();
			}
			
			if (lastNude.getPre()!=null)
			{
				lastNude.getPre().setNext(lastNude);
			}
			tail = lastNude;
		 }
		 

	}
	
	
	/**
	 * Insert a new node with data at the tail of the list.
	 **/
	public void insertLast( T data )
	{
		//create and set the data for the new node
		DoublyLinkedListNode<T> newNude = new DoublyLinkedListNode<T>();
		 newNude.setData(data);
		 //put the node into the list
		 if (tail == null)
		 {
			newNude.setPre(null);
			newNude.setNext(null);
			head = tail = newNude;
			
		 }
		 else 
		 {
			 tail.setNext(newNude);
			 newNude.setPre(tail);
			 newNude.setNext(null);
			 tail = newNude;
		 }
		 
		//update the tail
		 
		DoublyLinkedListNode<T> lastNude = new DoublyLinkedListNode<T>();
		lastNude = (DoublyLinkedListNode<T>) head;
		while (lastNude.getNext()!=null)
		{
			lastNude= lastNude.getNext();
		}
		if (lastNude.getPre()!=null)
		{
			lastNude.getPre().setNext(lastNude);
		}
		tail = lastNude;
		 
	}
	 
	/**
	 * Remove the first node
	 **/
	public void deleteFirst()
	{
		
		 
		 //update the previous point of the second element
		 if (head.getNext()!=null)
		 {
			 head = head.getNext();

			//make the previous pointer of the new head point to null
			 ((DoublyLinkedListNode<T>) head).setPre(null);
			// ((DoublyLinkedListNode<T>) head.getNext()).setPre((DoublyLinkedListNode<T>) head);
		 }
		 else
		 {
			 head = null;
			 tail = null;
		 }
		 
		 
		/*//update the tail
		DoublyLinkedListNode<T> lastNude;
		lastNude = (DoublyLinkedListNode<T>) head;
		while (lastNude.getNext()!=null)
		{
			lastNude= lastNude.getNext();
		}
		if (lastNude.getPre()!=null)
		{
			lastNude.getPre().setNext(lastNude);
		}
		tail = lastNude;*/
	}
	 
	/**
	 * Remove the last node
	 **/
	public void deleteLast()
	{
		/*LinkedListNode<T> newNude = new LinkedListNode<T>();
		newNude = head;
		while (newNude.getNext()!=null)
		{
			newNude= newNude.getNext();
			//getLastNode()= head;
		}
		newNude= null;*/
		
		//update the tail
		tail = tail.getPre();
		//update the next pointer
		tail.setNext(null);
		
	}
	 
	/**
	 * Remove node following currentNode
	 * If no node exists (i.e., currentNode is the tail), do nothing
	 **/
	public void deleteNext( DoublyLinkedListNode<T> currentNode )
	{
		//check if the node is tail
		if (currentNode.getNext()!=null){
			
			
			if(currentNode.getNext().getNext()!=null)
			{
				//update the next pointer
				currentNode.setNext(currentNode.getNext().getNext());
				//update the previous pointer
				( currentNode.getNext().getNext()).setPre(currentNode);
			}
			else
			{
				currentNode.setNext(null);
				tail = currentNode;
			}
			
		
		}
		
		//update the tail
		DoublyLinkedListNode<T> lastNude = new DoublyLinkedListNode<T>();
		lastNude = (DoublyLinkedListNode<T>) head;
		while (lastNude.getNext()!=null)
		{
			lastNude= lastNude.getNext();
		}
		if (lastNude.getPre()!=null)
		{
			lastNude.getPre().setNext(lastNude);
		}
		tail = lastNude;
		
	}
	
	/**
	 * Return a String representation of the list.
	 **/
	public String toString()
	{
		
		DoublyLinkedListNode<T> newNude =(DoublyLinkedListNode<T>) head;
		 String myString = "" + newNude.getData();
		 if (!isEmpty())
		 {
			 while (newNude.getNext() !=null)
				{
					//myString = newNude.toString();
					myString = myString+ " <-> "+newNude.getNext().getData();
					
					newNude = newNude.getNext();
				}
		 }
		
		return myString;
	}
	
	
	/**
	 * Get data stored in tail node of list.
	 **/
	public T getLast()
	{
		return getLastNode().getData();
	}
	 
	/**
	 * Get the tail node of the list.
	 **/
	public DoublyLinkedListNode<T> getLastNode()
	{
		return tail;
	}
	
	public DoublyLinkedListNode<T> search(T data)
	{
		DoublyLinkedListNode<T> target = new DoublyLinkedListNode<T>();
		target = (DoublyLinkedListNode<T>) head;
		while (!target.getData().equals(data)&&target.getNext()!=null)
		{
			target = target.getNext();
		}
		return target;
	}
	
	
}
