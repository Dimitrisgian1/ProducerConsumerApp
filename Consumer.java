package lab1;

public class Consumer {

	public static Good get()
	{
		//Critical sector
		return Storage.get();
		//end critical sector
	}
}

