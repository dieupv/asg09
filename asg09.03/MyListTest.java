
import java.util.*;

public class MyListTest{
	public static void main(String []args){

		MyList l = new MyList();
		l.append(new DataItem<Integer>(1));
		l.append(new DataItem<Integer>(2));
		System.out.println(l); // (1, 2)
		MyList l2 = new MyList();
		l2.append(new DataItem<String>("a"));
		l2.append(new DataItem<String>("b"));
		System.out.println(l2);
		
	}

}