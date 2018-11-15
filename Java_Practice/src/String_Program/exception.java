package String_Program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exception {

	public static void main(String[] args) throws FileNotFoundException   {
		// TODO Auto-generated method stub
				
		try
		{
			FileInputStream str=new FileInputStream("D:\\a.txt");
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		System.out.println("****");
		System.out.println("dadasaheb khade");
		System.out.println("****");;
		
		/*FileInputStream str=new FileInputStream("D:\\a.txt");	
		System.out.println("****");
		System.out.println("dadasaheb khade");
		System.out.println("****");*/
	}

}
