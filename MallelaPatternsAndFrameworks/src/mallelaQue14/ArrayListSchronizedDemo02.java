/**
 * 
 */
package mallelaQue14;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author S546832
 *
 */
public class ArrayListSchronizedDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> asd = new CopyOnWriteArrayList<String>();
		asd.add("fan");
		asd.add("ac");
		asd.add("cooler");

		System.out.println("Elements of synchronized ArrayList :");

		Iterator<String> itr = asd.iterator();

		while (itr.hasNext())
        System.out.println(itr.next());
	}

}
