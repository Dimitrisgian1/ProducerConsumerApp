package lab1;

import java.util.ArrayList;

public class Storage 
{
	static ArrayList<Good> goods = new ArrayList<Good>();
	
	public static void put(Good g)
	{
		goods.add(g);
	}
	
	public static Good get()
	{
		return goods.get(goods.size() - 1);
	}
}

