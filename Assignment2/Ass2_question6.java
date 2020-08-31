import java.util.*;
public class Ass2_question6 {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=input.nextInt();
		input.close();
		System.out.println("Hailstone Sequence:");
		System.out.println(n);
		while(n!=1)
		{
			if(n<1)
			{
				System.out.println("Overflow Occured!");
				break;
			}
			if(n%2==0)
				n=n/2;
			else
				n=3*n+1;
			System.out.println(n);
		}

	}

}
