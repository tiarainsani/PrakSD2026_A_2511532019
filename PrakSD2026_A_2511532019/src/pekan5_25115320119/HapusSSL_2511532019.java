package pekan5_25115320119;

public class HapusSSL_2511532019 {
	//fungsi untuk menghapus head
	public static NodeSSL_2511532019 deleteHead_2019(NodeSSL_2511532019 head_2019) {
		//jika SSL kosong
		if (head_2019 == null)
			return null;
		//pindahkan head ke node berikutnya
		head_2019=head_2019.next_2019;
		//return head baru
		return head_2019; }
	//fungsi menghapus node terakhir SSL
	public static NodeSSL_2511532019 removeLastNode_2019(NodeSSL_2511532019 head_2019) {
		//jika list kosong, return null
		if (head_2019==null) {
			return null;
		}
		//jika list satu node, hapus node dan return null
		if (head_2019.next_2019==null) {
			return null;
		}
		//temukan node terakhir ke dua
		NodeSSL_2511532019 secondLast_2019=head_2019;
		while(secondLast_2019.next_2019.next_2019 != null) {
			secondLast_2019=secondLast_2019.next_2019;
		}
		//hapus node terakhir
		secondLast_2019.next_2019=null;
		return head_2019;
	}
	//fungsi menghapus node di posisi tertentu
	public static NodeSSL_2511532019 deleteNode_2019(NodeSSL_2511532019 head_2019, int position) {
		NodeSSL_2511532019 temp_2019=head_2019;
		NodeSSL_2511532019 prev_2019=null;
		//jika linked list null
		if (temp_2019==null)
			return head_2019;
		//kasus 1:head dihapus
		if (position == 1) {
			head_2019=temp_2019.next_2019;
			return head_2019;}
			//kasus 2: menghapus node di tengah
			//telusuri ke node yang dihapus
		for (int i=1;temp_2019!=null&&i<position;i++) {
			prev_2019=temp_2019;
			temp_2019=temp_2019.next_2019;}
		//jika ditemukan, hapus node
		if (temp_2019 != null) {
			prev_2019.next_2019=temp_2019.next_2019;
		}else {
			System.out.println("Data tidak ada");
		}
		return head_2019;}
	
	//fungsi mencetak SSL
	public static void printList_2019 (NodeSSL_2511532019 head_2019) {
		NodeSSL_2511532019 curr=head_2019;
		while(curr.next_2019 != null) {
			System.out.print(curr.data_2019+"-->");
			curr = curr.next_2019;}
		if (curr.next_2019==null) {
			System.out.print(curr.data_2019); }
		System.out.println();}
	
	//kelas main
	public static void main (String[] args) {
		//buat SSL 1->2->3->4->5->6->null
		NodeSSL_2511532019 head_2019=new NodeSSL_2511532019(1);
		head_2019.next_2019=new NodeSSL_2511532019(2);
		head_2019.next_2019.next_2019=new NodeSSL_2511532019(3);
		head_2019.next_2019.next_2019.next_2019=new NodeSSL_2511532019(4);
		head_2019.next_2019.next_2019.next_2019.next_2019=new NodeSSL_2511532019(5);
		head_2019.next_2019.next_2019.next_2019.next_2019.next_2019=new NodeSSL_2511532019(6);
		//cetak list awal
		System.out.println("list awal :");
		printList_2019(head_2019);
		//hapus head
		head_2019=deleteHead_2019(head_2019);
		System.out.println("List setelah head dihapus:");
		printList_2019(head_2019);
		//hapus node terakhir
		head_2019=removeLastNode_2019(head_2019);
		System.out.println("List setelah simpul terakhir dihapus: ");
		printList_2019(head_2019);
		//deleting node at position 2
		int position_2019 = 2;
		head_2019=deleteNode_2019(head_2019, position_2019);
		//print list after deletion
		System.out.println("List setelah posisi 2 dihapus :");
		printList_2019(head_2019);
		}
	}



