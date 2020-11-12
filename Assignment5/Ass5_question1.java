
public class Ass5_question1 extends Thread{

	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
			if(i%10==0)
			{
				System.out.println("String");
			}
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Exception Occured");
			}
		}
	}
	public static void main(String[] args) {
		Ass5_question1 thread=new Ass5_question1();
		thread.start();
	}

}
