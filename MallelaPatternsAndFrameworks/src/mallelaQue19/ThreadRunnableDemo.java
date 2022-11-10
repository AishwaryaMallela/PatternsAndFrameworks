/**
 * 
 */
package mallelaQue19;

/**
 * @author S546832
 *
 */
public class ThreadRunnableDemo implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRunnableDemo trd = new ThreadRunnableDemo();
		Thread t = new Thread(trd);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method");
	}

}
