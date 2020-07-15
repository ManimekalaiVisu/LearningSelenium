package packDefault1;

public class B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is Class B1");
		B2 obj= new B2();
		obj.msg1();
		//oly class B2 can access value 
		//System.out.println("Value retrived from Class B2 is"+ obj.value);
		//A1 obj1= new A1();//due to which it is default class which cant access out the package
		//obj1.welcome();
		
	}
}

class B2{
	void msg1() {
		int value= 10;
		System.out.println("Message from Class B2");
	}
}