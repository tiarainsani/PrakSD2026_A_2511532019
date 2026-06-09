package pekan9_2511532019;

public class Node_2511532019 {
	int data_2019;
	Node_2511532019 left_2019;
	Node_2511532019 right_2019;
	public Node_2511532019 (int data_2019) {
		this.data_2019=data_2019;
		left_2019=null;
		right_2019=null;
	}
	public void setLeft_2019 (Node_2511532019 node_2019) {
		if (left_2019==null)
			left_2019=node_2019;
	}
	public void setRight_2019 (Node_2511532019 node_2019) {
		if (right_2019==null)
			right_2019=node_2019;
	}
	public Node_2511532019 getLeft_2019() {
		return left_2019;
	}
	public Node_2511532019 getRight_2019() {
		return right_2019;
	}
	public int getData_2019() {
		return data_2019;
	}
	public void setData_2019 (int data_2019) {
		this.data_2019=data_2019;
	}
	void printPreorder_2019 (Node_2511532019 node_2019) {
		if (node_2019==null)
			return;
		System.out.print(node_2019.data_2019+" ");
		printPreorder_2019(node_2019.left_2019);
		printPreorder_2019(node_2019.right_2019);
	}
	void printPostorder_2019 (Node_2511532019 node_2019) {
		if (node_2019==null)
			return;
		printPostorder_2019 (node_2019.left_2019);
		printPostorder_2019 (node_2019.right_2019);
		System.out.print(node_2019.data_2019+" ");
	}
	void printInorder_2019 (Node_2511532019 node_2019) {
		if (node_2019==null)
			return;
		printInorder_2019(node_2019.left_2019);
		System.out.print(node_2019.data_2019+" ");
		printInorder_2019(node_2019.right_2019);
	}
	public String print_2019 () {
		return this.print_2019("",true, "");
	}
	public String print_2019 (String prefix_2019, boolean isTail_2019, String sb_2019) {
		if (right_2019!=null) {
			right_2019.print_2019  (prefix_2019+(isTail_2019?"|  ":"  "), false, sb_2019);
		}
		System.out.println(prefix_2019 + (isTail_2019? "\\-- ":"/--")+data_2019);
		if (left_2019!=null) {
			left_2019.print_2019 (prefix_2019+(isTail_2019?"  ":"|  "), true, sb_2019);
		}
		return sb_2019;
	}
}
