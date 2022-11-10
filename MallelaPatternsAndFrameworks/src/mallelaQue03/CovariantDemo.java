/**
 * 
 */
package mallelaQue03;

/**
 * @author S546832
 *
 */
public class CovariantDemo extends A{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CovariantDemo().get().message();    
	}
	@Override  
	CovariantDemo get(){
		return this;
	}    
	void message(){
		System.out.println("welcome to covariant return type");
	} 
}

class A{    
	A get(){
		return this;
	}    
}    