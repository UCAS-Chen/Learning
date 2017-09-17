package linkList;

//节点类（元素）
public class Node {
	
	String name;//数据域
	Node next;//链域（下一个节点地址）
	
	
	public Node() {
		name = "";
		next = null;
	}
	
	public Node(String name) {
		this.name = name;
		next = null;
	}
}
