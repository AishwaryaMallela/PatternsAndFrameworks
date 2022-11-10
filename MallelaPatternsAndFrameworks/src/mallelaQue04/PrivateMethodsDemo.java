package mallelaQue04;

public class PrivateMethodsDemo extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new PrivateMethodsDemo();
	      b.action();
	}

	private void action() {
	     System.out.println("This is PrivateMethodsDemo action");    
	  }
}

class Base {
	  private void action() {
	     System.out.println("This is Base action");    
	  }
	}
  
	