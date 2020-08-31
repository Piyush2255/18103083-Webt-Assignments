import java.util.*;
public class Ass2_question2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=input.nextInt();
		System.out.println("Enter "+n+" numbers in range 0 to 20:");
		int[] arr=new int[n];
		int[] nums=new int[21];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
			if(arr[i]<0 || arr[i]>20)
			{
				System.out.println("This number is not in range [0,20]. Enter another number:");
				i--;
			}
			else
			{
				nums[arr[i]]++;
			}
		}
		input.close();
		int index=0;
		for(int i=0;i<=20;i++)
		{
			while(nums[i]>0)
			{
				arr[index]=i;
				index++;
				nums[i]--;
			}
		}
		System.out.println("Sorted array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
