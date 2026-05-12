package Pekan6_2511532019;

public class HapusDLL_2511532019 {
	//fungsi menghapus node awal
	public static NodeDLL_2511532019 delHead_2019(NodeDLL_2511532019 head_2019) {
		if (head_2019 == null) {
			return null;
		}
		NodeDLL_2511532019 temp_2019=head_2019;
		head_2019=head_2019.next_2019;
		if (head_2019 != null) {
			head_2019.prev_2019=null;
		}
		return head_2019;
	}
	//fungsi menghapus di akhir
	public static NodeDLL_2511532019 delLast_2019(NodeDLL_2511532019 head_2019) {
		if (head_2019==null) {
			return null;
		}
		if (head_2019.next_2019==null) {
			return null;
		}
		NodeDLL_2511532019 curr_2019=head_2019;
		while (curr_2019.next_2019 != null) {
			curr_2019= curr_2019.next_2019;
		}
		//update pointer previous node
		if (curr_2019.prev_2019 != null) {
			curr_2019.prev_2019.next_2019=null;
		}
		return head_2019;
	}
	//fungsi menghapus node posisi tertentu
	public static NodeDLL_2511532019 delPos_2019(NodeDLL_2511532019 head_2019, int pos_2019) {
		//jika DLL kosong
		if (head_2019==null) {
			return head_2019;
		}
		NodeDLL_2511532019 curr_2019 = head_2019;
		//telusurisampai ke node yang akan dihapus 
		for(int i= 1; curr_2019 != null && i<pos_2019; ++i) {
			curr_2019=curr_2019.next_2019;
		}
		//jika posisi tidak ditemukan
		if (curr_2019==null) {
			return head_2019;
		}
		//update pointer
		if (curr_2019.prev_2019 != null) {
			curr_2019.prev_2019.next_2019=curr_2019.next_2019;
		}
		if (curr_2019.next_2019 != null) {
			curr_2019.next_2019.prev_2019=curr_2019.prev_2019;
		}
		//jika yang dihapus head
		if (head_2019== curr_2019) {
			head_2019=curr_2019.next_2019;
		}
		return head_2019;
	}
	//fungsi mencetak DLL
	public static void printList_2019(NodeDLL_2511532019 head_2019) {
		NodeDLL_2511532019 curr_2019=head_2019;
		while (curr_2019 != null) {
			System.out.print(curr_2019.data_2019 + " <-> ");
			curr_2019= curr_2019.next_2019;
		}
		System.out.println();
	}
	public static void main (String[] args) {
		//buat sebuah DLL
		NodeDLL_2511532019 head_2019=new NodeDLL_2511532019(1);
		head_2019.next_2019=new NodeDLL_2511532019(2);
		head_2019.next_2019.prev_2019=head_2019;
		head_2019.next_2019.next_2019=new NodeDLL_2511532019(3);
		head_2019.next_2019.next_2019.prev_2019=head_2019.next_2019;
		head_2019.next_2019.next_2019.next_2019=new NodeDLL_2511532019(4);
		head_2019.next_2019.next_2019.next_2019.prev_2019=head_2019.next_2019.next_2019;
		head_2019.next_2019.next_2019.next_2019.next_2019=new NodeDLL_2511532019(5);
		head_2019.next_2019.next_2019.next_2019.next_2019.prev_2019=head_2019.next_2019.next_2019.next_2019;
		
		System.out.print("DLL Awal: ");
		printList_2019(head_2019);
		
		System.out.print("Setelah head dihapus: ");
		head_2019=delHead_2019(head_2019);
		printList_2019(head_2019);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head_2019 = delLast_2019 (head_2019);
		printList_2019(head_2019);
		
		System.out.print("Menghapus node ke 2: ");
		head_2019=delPos_2019(head_2019, 2);
		printList_2019(head_2019);
	}
}
