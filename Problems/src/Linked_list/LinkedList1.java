package Linked_list;

public class LinkedList1 {
	Node head;
	public void insert(int val)
	{
		Node node  = new Node();
		node.data = val;
		node.next = null;
		if(head==null)
		{
			head=node;
		}
		else {
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	public void show()
	{
		Node node = head;
		while(node.next!=null)
		{
			System.out.print(node.data+"\n");
			node = node.next;
		}
		System.out.print(node.data);
	}
	public void insertAtStart(int val)
	{
		Node node = new Node();
		node.data= val;
		node.next = null;
		node.next = head;
		head = node;
	}
	public void insertAt(int val,int pos)
	{
		Node node = new Node();
		node.data= val;
		node.next = null;
		Node n = head;
		for(int i=0;i<pos-1;i++)
		{
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}
}
