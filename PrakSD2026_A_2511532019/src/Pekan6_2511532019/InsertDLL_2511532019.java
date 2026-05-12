package Pekan6_2511532019;

public class InsertDLL_2511532019 {
	//menambah node di awal DLL
	static NodeDLL_2511532019 insertBegin_2019(NodeDLL_2511532019 head_2019, int data_2019) {
		//buat node baru
		NodeDLL_2511532019 new_node_2019=new NodeDLL_2511532019(data_2019);
		//jadikan pointer next nya head
		new_node_2019.next_2019=head_2019;
		//jadikan pointer prev head ke new_node
		if (head_2019 != null) {
			head_2019.prev_2019=new_node_2019;
		}
		return new_node_2019;
	}
	//fungsi menambahkan node di akhir
	public static NodeDLL_2511532019 insertEnd_2019(NodeDLL_2511532019 head_2019, int newData_2019) {
		//buat node baru
		NodeDLL_2511532019 newNode_2019=new NodeDLL_2511532019 (newData_2019);
		//jika dll nul jadikan head
		if (head_2019==null) {
			head_2019=newNode_2019;
		}
		else {
			NodeDLL_2511532019 curr_2019=head_2019;
			while (curr_2019.next_2019 != null) {
				curr_2019=curr_2019.next_2019;
			}
			curr_2019.next_2019=newNode_2019;
			newNode_2019.prev_2019=curr_2019;
		}
		return head_2019;
	}
	//fungsi menambah node di posisi tertentu
	public static NodeDLL_2511532019 insertAtPosition_2019 (NodeDLL_2511532019 head_2019, int pos_2019, int new_data_2019) {
		//buat node baru
		NodeDLL_2511532019 new_node_2019 = new NodeDLL_2511532019 (new_data_2019);
		if (pos_2019==1) {
			new_node_2019.next_2019=head_2019;
			if (head_2019 != null) {
				head_2019.prev_2019=new_node_2019;}
			head_2019=new_node_2019;
			return head_2019;}
		NodeDLL_2511532019 curr_2019 =head_2019;
		for (int i=1;i<pos_2019-1 && curr_2019 != null;++i) {
			curr_2019=curr_2019.next_2019;}
		if (curr_2019==null) {
			System.out.println("Posisi tidak ada");
			return head_2019;}
		new_node_2019.prev_2019=curr_2019;
		new_node_2019.next_2019=curr_2019.next_2019;
		curr_2019.next_2019=new_node_2019;
		if (new_node_2019.next_2019 != null) {
			new_node_2019.next_2019.prev_2019=new_node_2019;}
		return head_2019;
	}
	public static void printList_2019 (NodeDLL_2511532019 head_2019) {
		NodeDLL_2511532019 curr_2019=head_2019;
		while (curr_2019!=null) {
			System.out.print(curr_2019.data_2019 + " <-> ");
			curr_2019=curr_2019.next_2019;
		}
		System.out.println();
	}
	public static void main (String[] args) {
		//membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511532019 head_2019 = new NodeDLL_2511532019(2);
		head_2019.next_2019=new NodeDLL_2511532019(3);
		head_2019.next_2019.prev_2019=head_2019;
		head_2019.next_2019.next_2019=new NodeDLL_2511532019(5);
		head_2019.next_2019.next_2019.prev_2019=head_2019.next_2019;
		//cetak DLL awal
		System.out.print("DLL Awal: ");
		printList_2019(head_2019);
		//tambah 1 di awal
		head_2019= insertBegin_2019 (head_2019, 1);
		System.out.print("Simpul 1 ditambah di awal: ");
		printList_2019(head_2019);
		//tambah 6 di akhir
		System.out.print("Simpul 6 ditambah di akhir: ");
		int data_2019=6;
		head_2019=insertEnd_2019(head_2019, data_2019);
		printList_2019(head_2019);
		//menambah node 4 di posisi 4
		System.out.print("Tambah node 4 di posisi 4: ");
		int data2_2019=4;
		int pos_2019=4;
		head_2019=insertAtPosition_2019(head_2019, pos_2019, data2_2019);
		printList_2019(head_2019);
	}
}
	
	

