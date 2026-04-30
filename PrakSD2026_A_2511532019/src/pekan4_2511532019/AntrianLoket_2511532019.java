package pekan4_2511532019;

import java.util.*;

public class AntrianLoket_2511532019 {
	
	String queue_2019[];
	int front_2019, rear_2019, max_2019;

	public AntrianLoket_2511532019(int max_2019) {
		this.max_2019 = max_2019;
		queue_2019 = new String[max_2019];
		front_2019 = -1;
		rear_2019 = -1;
	}

	boolean isEmpty_2019() {
		return (front_2019 == -1);
	}

	boolean isFull_2019() {
		return (rear_2019 == max_2019 - 1);
	}

	void enqueue_2019(String data) {
		if (isFull_2019()) {
			System.out.println("Antrian penuh!");
		} else {
			if (isEmpty_2019()) {
				front_2019 = 0;
			}
			rear_2019++;
			queue_2019[rear_2019] = data;
			System.out.println("Data berhasil ditambahkan ke antrian");
		}
	}

	void dequeue_2019() {
		if (isEmpty_2019()) {
			System.out.println("Antrian kosong!");
		} else {
			System.out.println(queue_2019[front_2019] + " telah dilayani");
			front_2019++;
			if (front_2019 > rear_2019) {
				front_2019 = rear_2019 = -1;
			}
		}
	}

	void display_2019() {
		if (isEmpty_2019()) {
			System.out.println("Antrian kosong");
		} else {
			System.out.println("Isi antrian:");
			int no = 1;
			for (int i = front_2019; i <= rear_2019; i++) {
				System.out.println(no + ". " + queue_2019[i]);
				no++;
			}
		}
	}

	void reverse_2019() {
		if (isEmpty_2019()) {
			System.out.println("Antrian kosong");
		} else {
			Stack<String> stack_2019 = new Stack<>();
			for (int i = front_2019; i <= rear_2019; i++) {
				stack_2019.push(queue_2019[i]);
			}
			for (int i = front_2019; i <= rear_2019; i++) {
				queue_2019[i] = stack_2019.pop();
			}
			System.out.println("Antrian berhasil dibalik");
	    }
	}

}
