package CustomLL;

public class LL {
	public static void main(String[] args) {
		Node head;
		Node node=new Node();
		head=node;
		node.element=20;
		
		Node node1=new Node();
		node1.element=30;
		
		node.next=node1;
		
		Node node2=new Node();
		
		Node temp=head;
		while(temp.next!=null) {
			System.out.println(temp.element);
			temp=temp.next;
		}
		System.out.println(temp.element);
	}
}
