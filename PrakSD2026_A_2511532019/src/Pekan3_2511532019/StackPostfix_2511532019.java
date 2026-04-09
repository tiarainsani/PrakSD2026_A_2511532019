package Pekan3_2511532019;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511532019 {
	public static int postfixEvaluate_2019 (String expression) {
		Stack <Integer> s_2019 = new Stack <Integer>();
		Scanner input_2019 = new Scanner (expression);
		while (input_2019.hasNext()) {
			if (input_2019.hasNextInt()) {
				s_2019.push(input_2019.nextInt());
			}else {
				String operator_2019 = input_2019.next();
				int operand2_2019=s_2019.pop();
				int operand1_2019=s_2019.pop();
				if (operator_2019.equals("+")) {
					s_2019.push (operand1_2019+operand2_2019);
				}else if (operator_2019.equals("-")) {
					s_2019.push(operand1_2019-operand2_2019);
				}else if (operator_2019.equals("*")) {
					s_2019.push(operand1_2019*operand2_2019);
				}else {
					s_2019.push(operand1_2019/operand2_2019);
				}
			}
		}
		input_2019.close();
		return s_2019.pop();
	}
	public static void main (String [] args) {
		System.out.println("hasil postfix = "+ postfixEvaluate_2019 ("5 2 4 * + 7 -"));
	}

}
