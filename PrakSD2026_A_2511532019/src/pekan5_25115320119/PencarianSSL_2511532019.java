package pekan5_25115320119;

public class PencarianSSL_2511532019 {
	static boolean searchKey(NodeSSL_2511532019 head_2019, int key) {
		NodeSSL_2511532019 curr_2019 = head_2019;
		while(curr_2019 !=null) {
			if (curr_2019.data_2019 == key)
				return true;
			curr_2019 = curr_2019.next_2019;}
		return false;}
	public static void traversal (NodeSSL_2511532019 head_2019) {
		//mulai dari head
		NodeSSL_2511532019 curr_2019 = head_2019;
		//telusuri sampai pointer null
		while (curr_2019!=null) {
			System.out.print(" "+curr_2019.data_2019);
			curr_2019=curr_2019.next_2019;}
		System.out.println();}
	public static void main (String[] args) {
		NodeSSL_2511532019 head_2019 = new NodeSSL_2511532019(14);
		head_2019.next_2019=new NodeSSL_2511532019(21);
		head_2019.next_2019.next_2019=new NodeSSL_2511532019(13);
		head_2019.next_2019.next_2019.next_2019=new NodeSSL_2511532019(30);
		head_2019.next_2019.next_2019.next_2019.next_2019=new NodeSSL_2511532019(10);
		System.out.print("Penelusuran SSL : ");
		traversal (head_2019);
		//data yang akan dicari
		int key=30;
		System.out.print("cari data "+key+" = ");
		if (searchKey(head_2019, key))
			System.out.println("ketemu");
		else
			System.out.println("tidak ada");
	}
}
