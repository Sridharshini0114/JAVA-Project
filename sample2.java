//DataInputStream
package prgrm2;
import java.io.DataInputStream;
import java.io.IOException;

public class sample2 {
	int rollno;
	long stu_dob;
	String stu_name;
	
	DataInputStream dis=new DataInputStream(System.in);
	void Input() throws IOException
	{
		System.out.println("rollno is:");
		rollno =Integer.parseInt(dis.readLine());
		System.out.println("stu_dob:");
		stu_dob=Long.parseLong(dis.readLine());
		System.out.println("enter stu_name:");
		stu_name = dis.readLine();
				
	}
	void display()
	{
		System.out.println("rollno:"+rollno);
		System.out.println("stu_dob:"+stu_dob);
		System.out.println("stu_name is:"+stu_name);
	}
	public static void main(String[] args) throws IOException {
		sample2 s1=new sample2();
		s1.Input();
		s1.display();

		
		

	}

}
