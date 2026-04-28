package pekan4_2511532019;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511532019 {

	public static void main(String[] args) {
		Queue<Integer>q_2019=new LinkedList<Integer>();
		q_2019.add(1);
		q_2019.add(2);
		q_2019.add(3);//[1,2,3]
		System.out.println("Sebelum reverse = "+q_2019);
		Stack<Integer>s_2019=new Stack<Integer>();
		while (!q_2019.isEmpty()) {//Q -> S
			s_2019.push(q_2019.remove());
		}
		while (!s_2019.isEmpty()) { //S -> Q
			q_2019.add(s_2019.pop());
		}
		System.out.println("Sesudah reverse = "+q_2019);
	}
}
