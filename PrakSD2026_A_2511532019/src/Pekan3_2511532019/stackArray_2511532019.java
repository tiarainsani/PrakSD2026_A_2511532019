package Pekan3_2511532019;

public class stackArray_2511532019 {
	static final int MAX_2019=1000;
	int top;
	int a_2019[] = new int [MAX_2019];
	boolean isEmpty_2019() {
		return (top<0);
	}
	stackArray_2511532019 (){
		top=-1;
	}
	boolean push_2019 (int x)
	{
		if (top>= (MAX_2019-1)) {
			System.out.println("Stack Overlow");
			return false;
		}
		else {
			a_2019[++top]=x;
			System.out.println(x+" dimasukkan dalam stack");
			return true;
		}
	}
	int pop_2019() {
		if (top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}else {
			int x=a_2019[top--];
			return x;
		}
	}
	int peek_2019 ()
	{
		if (top <0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_2019 [top];
			return x;
		}
	}
	void print_2019() {
		for (int i = top; i>-1; i--) {
			System.out.print(" "+a_2019[i]);
		}
	}
}

