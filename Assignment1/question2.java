import java.util.*;
public class question2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter paragraph: ");
		String para=input.nextLine();
		System.out.println("Enter size of vector: ");
		int vecSize=input.nextInt();
		HashSet<String> vec=new HashSet<String>();
		System.out.println("Enter "+vecSize+" Strings:");
		for(int i=0;i<vecSize;i++)
		{
			String s=input.next();
			vec.add(s);
		}
		input.close();
		int n=para.length();
		int cur=0;
		System.out.println("Paragraph after formatting:");
		String newPara="";
		while(cur<n)
		{
			String s="";
			while(cur<n && para.charAt(cur)!=' ')
			{
				s+=para.charAt(cur);
				cur++;
			}
			if(vec.contains(s))
			{
				newPara+=s.charAt(0);
				for(int i=1;i<s.length();i++)
				{
					newPara+='*';
				}
			}
			else
			{
				newPara+=s;
			}
			if(cur<n && para.charAt(cur)==' ')
			{
				newPara+=" ";
			}
			cur++;
		}
		System.out.println(newPara);
	}

}
