package pekan7_2511532019;

public class InsertionSort_2511532019 {
	public static void insertionSort_2019(int[] arr_2019) {
		int n_2019 = arr_2019.length;
		for (int i_2019=1; i_2019<n_2019; i_2019++) {
			int key_2019 = arr_2019 [i_2019];
			int j_2019 = i_2019-1;
			while (j_2019>= 0 && arr_2019 [j_2019] > key_2019) {
				arr_2019 [j_2019+1]=arr_2019[j_2019];
				j_2019--;
			}
			arr_2019 [j_2019+1]=key_2019;
		}
		
	}
	public static void main (String[] args) {
		int arr_2019[]= {23,78,45,8,32,56,1};
		int n_2019 = arr_2019.length;
		System.out.printf("array yang belum terurut: \n");
		for (int i_2019=0; i_2019<n_2019; i_2019++)
			System.out.print(arr_2019[i_2019]+" ");
		System.out.println("");
		insertionSort_2019(arr_2019);
		System.out.printf("array yang terurut : \n");
		for (int i_2019=0; i_2019<n_2019; i_2019++)
			System.out.print(arr_2019[i_2019]+" ");
		System.out.println("");
	}
}
