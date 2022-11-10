/**
 * 
 */
package mallelaQue17;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author S546832
 *
 */
public class FailSafeIteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] {5, 10, 15, 20});
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
        Integer no = (Integer)itr.next();
        System.out.println(no);
        if (no == 8) {
            list.add(14);
        }
	}
}
}
