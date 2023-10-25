package star;
import java.util.Scanner;

public class sample {
	int i,j,row;
	Scanner sc=new Scanner(System.in);

void input()
{
	System.out.println("Enter the row value:");
	row= sc.nextInt();
}
void display()
{
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<=i;j++)
		{

			System.out.println("*");
			System.out.println("*");
		}
	}
	
}

public static void main(String[] args) {
	sample s1=new sample();
	s1.input();
	s1.display();
}
}
