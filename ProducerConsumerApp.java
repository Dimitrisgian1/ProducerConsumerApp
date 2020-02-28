package lab1;

public class ProducerConsumerApp {

	public static void main(String[] args) {
		
		boolean check = true;
		Producer producer = new Producer(check);
		Consumer consumer = new Consumer();
		
		//Create producer thread
		Thread prod = new Thread()
		{
		    public void run()
		    {
		        producer.put();
		    }
		};
		
		//Create consumer thread
		Thread cons = new Thread()
		{
		    public void run()
		    {		        
		        consumer.get();
		    }
		};
		

		
		prod.start();

        cons.start();
		
	}

}

