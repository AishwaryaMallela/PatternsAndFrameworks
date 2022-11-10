package mallelaQue01;

public class MallelaQue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsDemo <Integer, String> gd = new GenericsDemo<Integer, String>(123,"Generics Demo");
        gd.print();
	}
}
class GenericsDemo<A, B>
{
	A a1; 
	B b1; 
	GenericsDemo(A a1, B b1)
	{
		this.a1 = a1;
		this.b1 = b1;
	}
	public void print()
	{
		System.out.println(a1);
		System.out.println(b1);
	}
}

