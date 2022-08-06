package Module2;
import java.util.*;
import java.util.function.*;

class MyConsumer<T> implements Consumer<T>{
	public void accept (T ctask) {
		System.out.println("Working on  the number" + ctask);
		System.out.println("Result after adding 5 to given number is "+ ((int)ctask+5) );
	}
}

public class Utility_package_demo {
	
	public static void main(String args[]) {
		ArrayList mylist;
		MyConsumer mcons;
		
		mylist = new ArrayList<>(5);
		mcons = new MyConsumer();
		
		for (int i=0; i<5; i++)
		{
			mylist.add(100 + 100*i);
		}
		
		System.out.println(mylist);
		
		mylist.forEach(mcons);
		
	}

}
