package pekan9_2511532019;

public class BTreeDriver_2511532019 {
	public static void main (String[] args) {
		//membuat Pohon
		BTree_2511532019 tree_2019=new BTree_2511532019();
		System.out.print("Jumlah simpul awal pohon: ");
		System.out.println(tree_2019.countNodes_2019());
		//menambahkan simpul data
		Node_2511532019 root_2019=new Node_2511532019(1);
		//menjadikan simpul 1 sebagai root
		tree_2019.setRoot_2019(root_2019);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_2019.countNodes_2019());
		Node_2511532019 node2_2019 = new Node_2511532019 (2);
		Node_2511532019 node3_2019 = new Node_2511532019 (3);
		Node_2511532019 node4_2019 = new Node_2511532019 (4);
		Node_2511532019 node5_2019 = new Node_2511532019 (5);
		Node_2511532019 node6_2019 = new Node_2511532019 (6);
		Node_2511532019 node7_2019 = new Node_2511532019 (7);
		Node_2511532019 node8_2019 = new Node_2511532019 (8);
		Node_2511532019 node9_2019 = new Node_2511532019 (9);
		root_2019.setLeft_2019(node2_2019);
		node2_2019.setLeft_2019(node4_2019);
		node2_2019.setRight_2019(node5_2019);
		node4_2019.setRight_2019(node8_2019);
		root_2019.setRight_2019(node3_2019);
		node3_2019.setLeft_2019(node6_2019);
		node3_2019.setRight_2019(node7_2019);
		node6_2019.setLeft_2019(node9_2019);
		//set root
		tree_2019.setCurrent_2019(tree_2019.getRoot_2019());
		System.out.println("Menampilkan simpul terakhir: ");
		System.out.println(tree_2019.getCurrent_2019().getData_2019());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
		System.out.println(tree_2019.countNodes_2019());
		System.out.println("InOrder: ");
		tree_2019.printInorder_2019();
		System.out.println("\nPreorder: ");
		tree_2019.printPreorder_2019();
		System.out.println("\nPostorder: ");
		tree_2019.printPostorder_2019();
		System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
		tree_2019.print_2019();	
	}
}
