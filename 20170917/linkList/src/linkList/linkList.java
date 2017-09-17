package linkList;

public class linkList {
	
	Node head;//ͷ���
	public linkList() {
		head = new Node();
	}
	
	public void add(String data) {
		Node node = new Node(data);
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}
	
	public void del(String data) {
		Node temp = head;
		while(temp.next != null) {
			if(temp.next.name.equals(data)){
				temp.next = temp.next.next;
				break;
			}	
			temp = temp.next;
		}
	}
	
	public int size() {
		int len = 0;
		Node temp = head;
		while(temp.next != null) {
			len++;
			temp = temp.next;
		}
		return len;
	}
	
	public Node find(String data) {
		Node temp = head;
		Node node = null;
		while(temp.next != null) {
			if(temp.next.name.equals(data)) {
				node = temp.next;
				break;
			}
			temp = temp.next;
		}
		return node;
	}
	
	public void display() {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
			System.out.print(temp.name+"-->");
		}
	}
	
	public static void main(String[] args) {
		linkList link = new linkList();
		link.add("����");
		link.add("����");
		link.add("����");
		link.display();
		System.out.println("");
	/*	link.del("����");
		link.display();
		System.out.println("");*/
		System.out.print("������="+link.size());
		System.out.println("");
		Node node=link.find("����");
		System.out.print("find="+node.name);
	}
}
