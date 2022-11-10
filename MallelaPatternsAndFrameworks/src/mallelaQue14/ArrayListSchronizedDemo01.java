/**
 * 
 */
package mallelaQue14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author S546832
 *
 */
public class ArrayListSchronizedDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("Car");
		list.add("Bicycle");
		list.add("Truck");
		synchronized(list){
			Iterator itr = list.iterator();
			while (itr.hasNext())
		    System.out.println(itr.next());
		}
	}

}
