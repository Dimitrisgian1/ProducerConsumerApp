package lab1;

public class Storage 
{
	static Good[] goods;
	
	public static void put(Good g)
	{
		goods[0] = g;
	}
	
	public static Good get()
	{
		return goods[0];
	}
}
