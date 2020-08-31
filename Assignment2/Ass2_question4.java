public class Ass2_question4 {

	public static void main(String[] args) 
	{
		int i=1;
		while(true)
		{
			int sum = (i * (i + 1))/2;
	        if(sum == i * i)
	        break;
	        i++;
		}
		System.out.println(i);
	}

}
