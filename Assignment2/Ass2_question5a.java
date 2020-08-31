import java.util.*;
public class Ass2_question5a {
	
	public static void intersection(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int flag = 1;
        int[] arr = new int[Math.min(n1, n2)];
        int i1 = 0, i2 = 0, index = 0;
        while (i1 < n1 && i2 < n2) {
            if (arr1[i1] == arr2[i2]) {
                arr[index] = arr1[i1];
                index++;
                i1++;
                i2++;
                flag = 0;
            } else if (arr1[i1] < arr2[i2]) {
                i1++;
            } else i2++;
        }
        System.out.print("\nIntersection is:");
        if (flag == 1)
            System.out.print("NULL");
        else
            for (int i = 0; i < index; i++)
                System.out.print(" " + arr[i]);
    }

    public static void union(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr = new int[n1 + n2];
        int i1 = 0, i2 = 0, index = 0;
        while (i1 < n1 && i2 < n2) {
            if (arr1[i1] == arr2[i2]) {
                arr[index++] = arr1[i1++];
                i2++;
            } else if (arr1[i1] < arr2[i2])
                arr[index++] = arr1[i1++];
            else
                arr[index++] = arr2[i2++];
        }

        while (i2 < n2) 
        	arr[index++] = arr2[i2++];

        while (i1 < n1) 
        	arr[index++] = arr1[i1++];

        System.out.print("\nUnion is:");
        for (int i = 0; i < index; i++)
            System.out.print(" " + arr[i]);
    }

    public static void complement(int[] a1, int[] ref) {
        int n1 = a1.length, index = 0;
        int[] ours = new int[11];
        int i = 0, j = 0, flag = 1;

        while (index < 11 && i < n1) {
            if (a1[i] == ref[index]) {
                i++;
                index++;
            } else {
                ours[j++] = ref[index++];
                flag = 0;
            }
        }
        while (index < 11) {
            ours[j++] = ref[index++];
            flag = 0;
        }

        if (flag == 1)
            System.out.print("NULL");
        else
            for (i = 0; i < j; i++)
                System.out.print(" " + ours[i]);
    }

    public static int[] convertToSet(int[] arr) {
        int n = arr.length;
        int arr1[] = new int[11];
        for (int i = 0; i < n; i++)
            arr1[arr[i]]++;
        int index = 0;

        for (int i = 0; i < 11; i++) {
            if (arr1[i] != 0) {
                arr[index] = i;
                index++;
            }
        }
        int[] newArr = new int[index];
        for (int i = 0; i < index; i++)
            newArr[i] = arr[i];
        return newArr;
    }

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no. of elements in set1:");
		int n1=input.nextInt();
		int[] arr1=new int[n1];
		System.out.println("Enter "+n1+" elements(numbers should be in range [0,10]):");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=input.nextInt();
			while (arr1[i] < 0 || arr1[i] > 10) {
                System.out.println("Not a valid choice. Enter a number in range 0 to 10:");
                arr1[i] = input.nextInt();
            }
		}
		System.out.println("Enter no. of elements in set2:");
		int n2=input.nextInt();
		int[] arr2=new int[n2];
		System.out.println("Enter "+n2+" elements(numbers should be in range [0,10]):");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=input.nextInt();
			while (arr2[i] < 0 || arr2[i] > 10) {
                System.out.println("Not a valid choice. Enter a number in range 0 to 10:");
                arr2[i] = input.nextInt();
            }
		}
		input.close();
		int[] unv={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double start = System.currentTimeMillis();

        arr1 = convertToSet(arr1); //sort and handle repetitions
        arr2 = convertToSet(arr2);
        intersection(arr1, arr2);
        union(arr1, arr2);
        System.out.print("\nComplement of set1:");
        complement(arr1, unv);
        System.out.print("\nComplement of set2:");
        complement(arr2, unv);

        double end = System.currentTimeMillis();
        System.out.println("\nTime taken: " + (end - start) + " milliseconds");
	}

}
