package String_Program;

public class overriding_demo {

	
   void m1() {
	  System.out.println("Parent Methode");
  }
	
 	

}

class A extends overriding_demo
{
	public  void m1() {
		  System.out.println("Child Methode");
	  }
	
	public static void main(String[] args) {
		A a=new A();
		System.out.println("hjfffhhfjh");
		a.m1();
	
	}
	
}
