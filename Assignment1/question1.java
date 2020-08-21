import java.util.Scanner;
public class question1{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the text(only lowercase letters): ");
		String text=input.next();
		System.out.println("Enter the substring(only lowercase letters): ");
		String subString=input.next();
		int subLen=subString.length();
		int textLen=text.length();
		input.close();
		System.out.print("Answer: ");
		if(textLen<subLen)
		{
			System.out.println(0);
			return;
		}
		int[] arr=new int[26];
		int ans=0;
		for(int i=0;i<subLen;i++)
		{
			arr[text.charAt(i)-'a']++;
			arr[subString.charAt(i)-'a']--;
		}
		if(areAllZeroes(arr))
		{
			ans++;
		}
		for(int i=subLen;i<textLen;i++)
		{
			arr[text.charAt(i-subLen)-'a']--;
			arr[text.charAt(i)-'a']++;
			if(areAllZeroes(arr))
				ans++;
		}
		System.out.println(ans);
	}
	public static boolean areAllZeroes(int[] arr)
	{
		for(int i=0;i<26;i++)
		{
			if(arr[i]!=0)
				return false;
		}
		return true;
	}
}