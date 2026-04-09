package Pekan3_2511532019;
import java.util.Stack;
public class NilaiMaksimum_2511532019 {
	public static int max_2019(Stack<Integer>s_2019) {
		Stack<Integer> backup_2019 = new Stack <Integer>();
		int maxValue_2019= s_2019.pop();
		backup_2019.push(maxValue_2019);
		while(!s_2019.isEmpty()) {
			int next_2019 = s_2019.pop();
			backup_2019.push(next_2019);
			maxValue_2019=Math.max(maxValue_2019, next_2019);
		}
		while (!backup_2019.isEmpty()) {
			s_2019.push(backup_2019.pop());
			}
		return maxValue_2019;
		}
	public static void main (String[] args) {
		Stack <Integer> s_2019= new Stack <Integer>();
		s_2019.push(70);
		s_2019.push(12);
		s_2019.push(20);
		System.out.println("isi stack " +s_2019);
		System.out.println("Stack Teratas "+s_2019.peek());
		System.out.println("Nilai maksimum "+ max_2019 (s_2019));	
	}
}