/**
 * 
 */
package mallelaQue10;

import java.io.FileNotFoundException;

/**
 * @author S546832
 *
 */
public class ThrowsDemo extends SuperClass{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo td = new ThrowsDemo();
	    td.demoMethod();
	}
	public void demoMethod() {
	      System.out.println("Method of Subclass");
	   }

}

abstract class SuperClass{
	   public void demoMethod()throws FileNotFoundException{
	      System.out.println("Method of superclass");
	   }
	}