package packProtected1;
import packProtected.*;


public class B3 extends A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Second Package Class");
		B3 obj= new B3();
		A3 obj1= new A3();
		obj.welcome();
		//obj1.welcome();
	}
}
