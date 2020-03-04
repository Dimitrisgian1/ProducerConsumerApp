package lab1;
import java.util.concurrent.*; 

public class Producer extends Thread{

	public Producer(Semaphore sem)
	{
	    public void run()
	    {
	    	Good prodgood = Producer.produce();
	        Producer.put(prodgood, sem);
	        return;
	    }
	}

	public static Good produce()
	{
		return new Good("abc", 1);
	}
	
	
	public static void put(Good good, Semaphore sem)
	{
		while(true)
		{
			try {
				sem.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			//Critical sector
			Storage.put(good);
			//end critical sector
			sem.release();			
			//remaining section
			System.out.println("Running Producer remaining sector...\nFinished producer remaining sector!");
		}
	}
}
