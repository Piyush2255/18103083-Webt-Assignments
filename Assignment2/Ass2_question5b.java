import java.util.*;
public class Ass2_question5b {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
        Set<Integer> set1=new HashSet<Integer>();
        Set<Integer> set2=new HashSet<Integer>();
        Set<Integer> unv=new HashSet<Integer>();
        
        unv.addAll(Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        
        System.out.println("Enter no. of elements in set1:");
        int n1=input.nextInt();
        
        System.out.println("Enter "+n1+" elements(numbers should be in range [0,10]):");
        for(int i = 0; i < n1; i++) {
            int x = input.nextInt();
            while(x < 0 || x > 10) {
                System.out.println("Not a valid choice. Enter a number in range 0 to 10");
                x = input.nextInt();
            }
            set1.add(x);
        }
        System.out.println("Enter no. of elements in set2:");
        int n2=input.nextInt();
        //second set
        System.out.println("Enter "+n2+" elements(numbers should be in range [0,10]):");
        for(int i=0; i<n2; i++) {
            int x=input.nextInt();
            while(x<0 || x>10) {
                System.out.println("Not a valid choice. Enter a number in range 0 to 10");
                x=input.nextInt();
            }
            set2.add(x);
        }
        input.close();
        double start = System.currentTimeMillis();
        Set<Integer> union_ans=new HashSet<Integer>(set1);
        union_ans.addAll(set2);
        
        Set<Integer> int_ans= new HashSet<Integer>(set1);
        int_ans.retainAll(set2);
        
        
        Set<Integer> compset1= new HashSet<Integer>(unv);
        compset1.removeAll(set1);
        
        
        Set<Integer> compset2= new HashSet<Integer>(unv);
        compset2.removeAll(set2);
        
        
        double end = System.currentTimeMillis();
        System.out.println("Union: "+union_ans);
        System.out.println("Intersection: "+int_ans);
        System.out.println("Complement of set 1: "+compset1);
        System.out.println("Complement of set 2: "+compset2);
        System.out.println("Time taken: "+(end-start)+" milliseconds");

	}

}
