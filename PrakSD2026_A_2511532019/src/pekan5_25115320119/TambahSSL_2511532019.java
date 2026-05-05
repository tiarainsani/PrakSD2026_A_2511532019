package pekan5_25115320119;

public class TambahSSL_2511532019 {
	public static NodeSSL_2511532019 insertAtFront(NodeSSL_2511532019 head_2019, int value) {
		NodeSSL_2511532019 new_node_2019=new NodeSSL_2511532019(value);
		new_node_2019.next_2019=head_2019;
		return new_node_2019;	
	}
	//fungsi menambahkan node di akhir SSL
	public static NodeSSL_2511532019 insertAtEnd(NodeSSL_2511532019 head_2019, int value) {
		//buat sebuah node dengan sebuah nilai
		NodeSSL_2511532019 newNode_2019=new NodeSSL_2511532019(value);
		//jika list kosong maka node menjadi head
		if (head_2019==null) {
			return newNode_2019;
		}
		//simpan head ke variabel sementara
		NodeSSL_2511532019 last_2019=head_2019;
		//telusuri ke node akhir
		while(last_2019.next_2019 !=null) {
			last_2019=last_2019.next_2019;
		}
		//ubah pointer
		last_2019.next_2019=newNode_2019;
		return head_2019;
	}
	static NodeSSL_2511532019 GetNode(int data_2019) {
		return new NodeSSL_2511532019(data_2019);
	}
	static NodeSSL_2511532019 insertPos(NodeSSL_2511532019 headNode_2019, int position_2019, int value) {
		NodeSSL_2511532019 head_2019=headNode_2019;
		if (position_2019<1)
			System.out.println("Invalid position");
		if(position_2019==1) {
			NodeSSL_2511532019 new_node_2019=new NodeSSL_2511532019(value);
			new_node_2019.next_2019=head_2019;
			return new_node_2019;
		}else {
			while (position_2019-- != 0) {
				if (position_2019 == 1) {
					NodeSSL_2511532019 newNode_2019=GetNode(value);
					newNode_2019.next_2019=headNode_2019.next_2019;
					headNode_2019.next_2019=newNode_2019;
					break;
				}
				headNode_2019=headNode_2019.next_2019;
			}
			if(position_2019 !=1)
				System.out.println("Posisi di luar jangkauan");
			return head_2019;
		}
	}
		public static void printList (NodeSSL_2511532019 head_2019) {
			NodeSSL_2511532019 curr=head_2019;
			while(curr.next_2019 !=null) {
				System.out.print(curr.data_2019+"-->");
				curr=curr.next_2019;
			}
			if (curr.next_2019==null) {
				System.out.print(curr.data_2019);
			}
			System.out.println();
		}
		public static void main (String[] args) {
			//buat linked list 2->3->5->6
			NodeSSL_2511532019 head_2019=new NodeSSL_2511532019(2);
			head_2019.next_2019=new NodeSSL_2511532019(3);
			head_2019.next_2019.next_2019=new NodeSSL_2511532019(5);
			head_2019.next_2019.next_2019.next_2019=new NodeSSL_2511532019(6);
			//cetak list asli
			System.out.print("Senarai berantai awal: ");
			printList(head_2019);
			//tambahkan node baru di depan
			System.out.print("tambah 1 simpul di depan: ");
			int data_2019=1;
			head_2019=insertAtFront(head_2019, data_2019);
			//cetak update list
			printList(head_2019);
			//tambahkan node baru di belakang
			System.out.print("tambah 1 simpul di belakang: ");
			int data2_2019=7;
			head_2019=insertAtEnd(head_2019, data2_2019);
			//cetak update list
			printList(head_2019);
			System.out.print("tambah 1 simpul di ke data 4: ");
			int data3_2019=4;
			int pos_2019=4;
			head_2019=insertPos(head_2019, pos_2019, data3_2019);
			//cetak update list
			printList(head_2019);
	}
}
