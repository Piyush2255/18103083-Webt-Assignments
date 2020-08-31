import java.util.*;
public class Ass2_question3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=input.nextInt();
		String[] strings=new String[n];
		System.out.println("Enter "+n+" strings:");
		for(int i=0;i<n;i++)
		{
			strings[i]=input.next();
		}
		input.close();
		for(int i=0;i<n-1;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(isGreater(strings[j-1],strings[j]))
				{
					String temp=strings[j-1];
					strings[j-1]=strings[j];
					strings[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(strings[i]);
		}

	}
	static boolean isGreater(String str1,String str2)
	{
		int i=0,j=0;
		while(i<str1.length() && j<str2.length())
		{
			if(str1.charAt(i)>str2.charAt(j))
				return true;
			else if(str1.charAt(i)<str2.charAt(j))
				return false;
			i++;
			j++;
		}
		if(i<str1.length())
			return true;
		if(j<str2.length())
			return false;
		return false;
	}

}
