package lab1;
import java.util.concurrent.*; 

public class ProducerConsumerApp {

	public static void main(String[] args) {
		
		Semaphore sem = new Semaphore(1);
		Producer producer = new Producer(sem);
		Consumer consumer = new Consumer(sem);

		producer.start();
		consumer.start();
		
	}

}
