package lab1;
import java.util.concurrent.*; 

public class Consumer extends Thread{

	public Consumer(Semaphore sem)
	{
		Thread cons = new Thread()
		{
		    public void run()
		    {		        
		    	Good consgood = Consumer.get(sem);
		    	if(!(consgood.str == "abc" && consgood.i == 1))
		    		System.out.println("Error: Corrupted Good!\n");
		    	return;
		    }
		};
	}
	
	public static Good get(Semaphore sem)
	{
		while(true)
		{
			try {
				sem.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Critical sector
			Good good = Storage.get();
			//end critical sector
			sem.release();
			System.out.println("Running consumer remaining sector...\nFinished consumer remaining sector!");

			return good;
		}

	}
}
