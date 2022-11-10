/**
 * 
 */
package mallelaQue18;

/**
 * @author S546832
 *
 */
public class ThreadTwiceDemo extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTwiceDemo t1=new ThreadTwiceDemo();  
		  t1.start();  
		  t1.start();  
	}

	public void run(){  
		System.out.println("running");  
	}  
}
