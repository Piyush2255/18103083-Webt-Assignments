import java.util.*;
public class question4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String 1(Only lowercase characters):");
		String s1=input.next();
		System.out.println("Enter String 2(Only lowercase characters):");
		String s2=input.next();
		input.close();
		if(s1.length()!=s2.length())
		{
			System.out.println("Strings are not Anagram!");
			return;
		}
		int[] arr=new int[26];
		for(int i=0;i<s1.length();i++)
		{
			arr[s1.charAt(i)-'a']++;
			arr[s2.charAt(i)-'a']--;
		}
		for(int i=0;i<26;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println("Strings are not Anagram!");
				return;
			}
		}
		System.out.println("Strings are Anagram!");
	}

}
