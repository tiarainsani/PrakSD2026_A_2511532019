package pekan8_2511532019;

public class MergeSort_2511532019 {
	void merge_2019 (int arr_2019[], int l_2019, int m_2019, int r_2019) {
		//find sizes of two subarrays to be merged
		int n1_2019=m_2019-l_2019+1;
		int n2_2019=r_2019-m_2019;
		/* Create temp arrays*/
		int L_2019[] = new int[n1_2019];
		int R_2019[] = new int [n2_2019];
		/* Copy data to temp arrays*/
		for (int i_2019= 0; i_2019<n1_2019; ++i_2019) 
			L_2019[i_2019]=arr_2019[l_2019+i_2019];
		for (int j_2019=0; j_2019<n2_2019;++j_2019)
			R_2019[j_2019]=arr_2019[m_2019+1+j_2019];
		int i_2019=0,j_2019=0;
		
		//initial index of merged suarray array
		int k_2019=l_2019;
		while (i_2019<n1_2019 && j_2019<n2_2019) {
			if (L_2019[i_2019]<= R_2019[j_2019]) {
				arr_2019[k_2019]=L_2019[i_2019];
				i_2019++;
			}else {
				arr_2019[k_2019]=R_2019[j_2019];
				j_2019++;
			}
			k_2019++;
		}
		/* Copy remaining elements of L[] if any */
		while (j_2019<n2_2019) {
			arr_2019[k_2019]=R_2019[j_2019];
			j_2019++;
			k_2019++;
		}
	}
	void sort_2019 (int arr_2019[], int l_2019, int r_2019) {
		if (l_2019<r_2019) {
			//fint the middle point
			int m_2019 = (l_2019+r_2019)/2;
			//sort first and second halves
			sort_2019 (arr_2019, l_2019, m_2019);
			sort_2019 (arr_2019, m_2019+1, r_2019);
			//merge the sorted halves
			merge_2019 (arr_2019, l_2019, m_2019, r_2019);
		}
	}
	/*A utility function to print array of size n*/
	static void printArray_2019(int arr_2019[]) {
		int n_2019 = arr_2019.length;
		for (int i_2019=0; i_2019<n_2019;++i_2019)
			System.out.print(arr_2019[i_2019]+" ");
		System.out.println();
	}
	public static void main (String args[]) {
		int arr_2019[] = {12, 11, 13, 5, 6, 7};
		System.out.println("Sebelum terurut");
		printArray_2019(arr_2019);
		MergeSort_2511532019 ob_2019=new MergeSort_2511532019();
		ob_2019.sort_2019(arr_2019, 0, arr_2019.length-1);
		System.out.println("/n Sesudah Terurut menggunakan merge Sort");
		printArray_2019(arr_2019);
	}
}
