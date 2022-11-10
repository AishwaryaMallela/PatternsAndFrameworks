/**
 * 
 */
package mallelaQue13;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;



/**
 * @author S546832
 *
 */
public class VectorAndArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
        al.add("Apple");
        al.add("Mango");
        al.add("Grapes");
        al.add("Strawberry");
        System.out.println("ArrayList elements are:");
       Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
 
        Vector<String> v = new Vector<String>();
        v.addElement("Blue");
        v.addElement("White");
        v.addElement("Orange");
 
        System.out.println("Vector elements are:");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
	}

}
