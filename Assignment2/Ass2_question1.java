import java.util.*;
public class Ass2_question1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter string 1: ");
		str1=input.nextLine();
		System.out.println("Enter string 2: ");
		str2=input.nextLine();
		input.close();
		int i=0,j=0,flag=0;
		while(i<str1.length() && j<str2.length())
		{
			if(str1.charAt(i)>str2.charAt(j))
			{
				System.out.println(str2+" occurs before "+str1);
				flag=1;
				break;
			}
			else if(str1.charAt(i)<str2.charAt(j))
			{
				System.out.println(str1+" occurs before "+str2);
				flag=1;
				break;
			}
			i++;
			j++;
		}
		if(flag==0)
		{
			if(i<str1.length())
			{
				System.out.println(str2+" occurs before "+str1);
			}
			else if(j<str2.length())
			{
				System.out.println(str1+" occurs before "+str2);
			}
			else
			{
				System.out.println("Both strings are equal!");
			}
		}
	}

}
