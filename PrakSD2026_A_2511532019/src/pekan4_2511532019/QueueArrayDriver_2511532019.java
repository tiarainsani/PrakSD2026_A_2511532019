package pekan4_2511532019;

public class QueueArrayDriver_2511532019 {

	public static void main(String[] args) {
		QueueArray_2511532019 queue_2019=new QueueArray_2511532019(1000);
		queue_2019.enqueue_2019(10);
		queue_2019.enqueue_2019(20);
		queue_2019.enqueue_2019(30);
		queue_2019.enqueue_2019(40);
		System.out.println("Item di depan "+ queue_2019.front_2019());
		System.out.println("Item paling belakang "+queue_2019.rear_2019());
		System.out.println("tampilan queue");
		queue_2019.display_2019();
		System.out.println();
		System.out.println(queue_2019.dequeue_2019()+ " dihapus dari queue");
		System.out.println("item di depan: "+ queue_2019.front_2019());
		System.out.println("item belakan : " + queue_2019.rear_2019());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue_2019.display_2019();	
	}
}
