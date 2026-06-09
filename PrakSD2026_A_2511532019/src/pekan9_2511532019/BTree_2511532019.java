package pekan9_2511532019;

public class BTree_2511532019 {
	private Node_2511532019 root_2019;
	private Node_2511532019 currentNode_2019;
	public BTree_2511532019() {
		root_2019=null;
	}
	public boolean search_2019 (int data_2019) {
		return search_2019 (root_2019, data_2019);
	}
	private boolean search_2019 (Node_2511532019 node_2019, int data_2019) {
		if (node_2019.getData_2019()==data_2019)
			return true;
		if (node_2019.getLeft_2019()!=null)
			if (search_2019 (node_2019.getLeft_2019(), data_2019))
				return true;
		if (node_2019.getRight_2019()!= null)
			if(search_2019 (node_2019.getRight_2019(),data_2019))
			return true;
		return false;
	}
	public void printInorder_2019() {
		root_2019.printInorder_2019(root_2019);
		}
	public void printPreorder_2019() {
		root_2019.printPreorder_2019(root_2019);
	}
	public void printPostorder_2019() {
		root_2019.printPostorder_2019(root_2019);
	}
	public Node_2511532019 getRoot_2019() {
		return root_2019;
	}
	public boolean isEmpty_2019() {
		return root_2019==null;
	}
	public int countNodes_2019() {
		return countNodes_2019(root_2019);
	}
	private int countNodes_2019(Node_2511532019 node_2019) {
		int count_2019=1;
		if (node_2019==null) {
			return 0;
		}else {
			count_2019 += countNodes_2019 (node_2019.getLeft_2019());
			count_2019 += countNodes_2019 (node_2019.getRight_2019());
			return count_2019;
		}
	}
	public void print_2019 () {
		root_2019.print_2019();
	}
	public Node_2511532019 getCurrent_2019() {
		return currentNode_2019;
	}
	public void setCurrent_2019 (Node_2511532019 node_2019) {
		this.currentNode_2019=node_2019;
	}
	public void setRoot_2019 (Node_2511532019 root_2019) {
		this.root_2019=root_2019;
	}
}
