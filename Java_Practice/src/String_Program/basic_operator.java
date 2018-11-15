package String_Program;

public class basic_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=10, b=20;
			int c=a++;
			System.out.println(c);
			c=++a;
			System.out.println(c);
			
			int e=b--;
			System.out.println(e);
			 e=--b;
			System.out.println(e);
			
			
			basic_operator bo1=new basic_operator();
			basic_operator bo2=new basic_operator();
			System.out.println(bo1.equals(bo2));
					
			
	}

}
