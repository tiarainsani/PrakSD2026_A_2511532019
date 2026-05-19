package pekan7_2511532019;

public class BubleSort_2511532019 {
	public static void bubleSort_2019(int[]arr_2019) {
		int n_2019=arr_2019.length;
		for (int i_2019=0; i_2019<n_2019; i_2019++) {
			for (int j_2019=0; j_2019<n_2019-i_2019-1; j_2019++) {
				if (arr_2019[j_2019]> arr_2019[j_2019+1]) {
					int temp_2019 = arr_2019[j_2019];
					arr_2019[j_2019]=arr_2019[j_2019+1];
					arr_2019[j_2019+1]=temp_2019;
					//System.out.println("data : "+arr[j] + " " +arr[j+1]);
				}
			}
		}
	}
	public static void main (String[] args) {
		int arr_2019[]= {23,78,45,8,32,56,1};
		int n_2019 = arr_2019.length;
		System.out.printf("array yang belum terurut: ");
		for (int i_2019=0; i_2019<n_2019; i_2019++)
			System.out.print(arr_2019[i_2019]+" ");
		System.out.println("");
		bubleSort_2019(arr_2019);
		System.out.printf("array yang terurut menggunakan BubleSort : ");
		for (int i_2019=0; i_2019<n_2019; i_2019++)
			System.out.print(arr_2019[i_2019]+" ");
		System.out.println("");
	}
}
