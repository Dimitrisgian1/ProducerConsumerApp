package lab1;

public class Producer {

	static Good good;
	static boolean check;
	
	public Producer(boolean c)
	{
        good.str = "abc";
        good.i = 0;
        check = c;
	}
	
	
	public static void put()
	{

			//Critical sector
			Storage.put(good);
			//end critical sector
			

	}
}

