package pekan4_2511532019;

public class QueueArray_2511532019 {
	int front_2019, rear_2019, size_2019;
	int capacity_2019;
	int array_2019[];
	
	public QueueArray_2511532019(int capacity_2019) {
		this.capacity_2019=capacity_2019;
		front_2019=this.size_2019=0;
		rear_2019=capacity_2019-1;
		array_2019=new int [this.capacity_2019];
	}
	
	boolean isFull_2019 (QueueArray_2511532019 queue_2019) {
		return  (queue_2019.size_2019 == queue_2019.capacity_2019);
	}
	
	boolean isEmpty_2019 (QueueArray_2511532019 queue_2019) {
		return (queue_2019.size_2019==0);
	}
	
	void enqueue_2019 (int item_2019) {
		if (isFull_2019(this))
			return;
		this.rear_2019=(this.rear_2019+1)%this.capacity_2019;
		this.array_2019 [this.rear_2019]=item_2019;
		this.size_2019=this.size_2019+1;
		System.out.println(item_2019 + " enqueued to queue");
	}
	int dequeue_2019() {
		if (isEmpty_2019(this))
			return Integer.MIN_VALUE;
		int item_2019=this.array_2019[this.front_2019];
		this.front_2019=(this.front_2019+1)%this.capacity_2019;
		this.size_2019=this.size_2019-1;
		return item_2019;
	}
	int front_2019() {
		if(isEmpty_2019(this))
			return Integer.MIN_VALUE;
		return this.array_2019[this.front_2019];
	}
	int rear_2019() {
		if (isEmpty_2019(this))
			return Integer.MIN_VALUE;
		return this.array_2019[this.rear_2019];
	}
	//mencetak elemen antrian
	void display_2019() {
		int i;
		if(front_2019 == rear_2019) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		//kunjungi dari belakang dan cetaak
		for (i=front_2019;i<rear_2019;i++) {
			System.out.printf("%d <-- ",array_2019[i]);
		}
		return;
	}
}
