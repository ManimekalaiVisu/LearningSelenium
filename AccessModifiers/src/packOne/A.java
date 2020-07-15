package packOne;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B obj= new B();//due to private constructor
		//obj.msg();//due to msg()method assigned as private
		//System.out.println(obj.data);//due to data assigned as private
		
	}
}


class B{
	private B()
	{}
	private int data=10;
	private void msg()
	{
		System.out.println("Hello java from Class B");
	}
}