package pekan8_2511532019;

public class QuickSort_2511532019 {
	static void swap_2019 (int[] arr_2019, int i_2019, int j_2019) {
		int temp_2019 = arr_2019[i_2019];
		arr_2019[i_2019]=arr_2019[j_2019];
		arr_2019[j_2019]=temp_2019;
	}
	//metode tambahan untuk mengatur pivot menggunakan median-og-three
	static void medianOfThree_2019(int[] arr_2019, int low_2019, int high_2019) {
		int mid_2019=low_2019+(high_2019-low_2019)/2;
		//Urutkan elemen low, mid, dan high
		if (arr_2019[low_2019]>arr_2019[mid_2019]) {
			swap_2019(arr_2019,low_2019, mid_2019);
		}
		if (arr_2019[low_2019]>arr_2019[high_2019]) {
			swap_2019 (arr_2019, low_2019, high_2019);
		}
		if (arr_2019[mid_2019]>arr_2019[high_2019]) {
			swap_2019(arr_2019, mid_2019, high_2019);
		}
		swap_2019 (arr_2019,mid_2019,high_2019);
	}
	static int partition_2019(int[] arr_2019, int low_2019, int high_2019) {
		//panggil fungsi medianOfThree sebelum menentukan pivot
		medianOfThree_2019(arr_2019,low_2019,high_2019);
		
		int pivot_2019=arr_2019[high_2019];//sekarang arr[high]sudah berisi nilai median
		int i_2019=(low_2019-1);
		
		for (int j_2019=low_2019; j_2019<=high_2019-1; j_2019++) {
			//jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if (arr_2019[j_2019]<pivot_2019) {
				//Increment indeks elemen yang lebih kecil
				i_2019++;
				swap_2019 (arr_2019,i_2019,j_2019);
			}
		}
		swap_2019 (arr_2019, i_2019+1, high_2019);
		return(i_2019+1);
	}
	static void quickSort_2019(int[] arr_2019, int low_2019, int high_2019) {
		if (low_2019<high_2019) {
			int pi_2019=partition_2019(arr_2019, low_2019, high_2019);
			quickSort_2019(arr_2019, low_2019, pi_2019-1);
			quickSort_2019(arr_2019, pi_2019+1, high_2019);
		}
	}
	public static void printArr_2019(int[] arr_2019) {
		for (int i_2019=0; i_2019<arr_2019.length; i_2019++) {
			System.out.print(arr_2019[i_2019]+" ");
		}
		System.out.println();
	}
	
	public static void main (String[] args) {
		int[] arr_2019= {10,7,8,9,1,5};
		int N_2019 = arr_2019.length;
		System.out.print("Data belum ditemukan: ");
		printArr_2019(arr_2019);
		
		quickSort_2019(arr_2019, 0, N_2019-1);
		
		System.out.print("Data terurut quicksort: ");
		printArr_2019(arr_2019);
	}
}
