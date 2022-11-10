/**
 * 
 */
package mallelaQue02;

/**
 * @author S546832
 *
 */
public class AccessModifiersDemo1 extends A{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiersDemo1 am = new AccessModifiersDemo1();
		am.displaymethod();
	}
	public void displaymethod()
    {
        System.out.println("Welcome to NWMSU");
    }
}


class A {
    protected void displaymethod()
    {
        System.out.println("Welcome to NWMSU");
    }
}