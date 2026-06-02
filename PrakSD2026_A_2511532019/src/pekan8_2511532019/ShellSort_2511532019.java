package pekan8_2511532019;

public class ShellSort_2511532019 {
	public static void shellSort_2019 (int [] A_2019) {
		int n_2019 = A_2019.length;
		int gap_2019 = n_2019/2;
		while (gap_2019>0) {
			for (int i_2019=gap_2019; i_2019<n_2019;i_2019++) {
				int temp_2019 = A_2019[i_2019];
				int j_2019=i_2019;
				while (j_2019>=gap_2019 && A_2019[j_2019-gap_2019]>temp_2019) {
					A_2019[j_2019]=A_2019[j_2019-gap_2019];
					j_2019=j_2019-gap_2019;
				}
				A_2019[j_2019]=temp_2019;
			}
			gap_2019=gap_2019/2;
		}
	}
	public static void main(String[] args) {
		int[] data_2019 = {3,10,4,6,8,9,7,2,1,5};
		
		System.out.print("Sebelum: ");
		printArray(data_2019);
		
		shellSort_2019(data_2019);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray(data_2019);
		}
	
	public static void printArray(int[] arr_2019) {
		for(int i_2019:arr_2019) System.out.print(i_2019+" ");
		System.out.println();
	}
}