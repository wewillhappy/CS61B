import java.util.Scanner;

public class Collatz {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num=sc.nextInt();
         for(int i=0;i<5;i++){
             System.out.print(nextNumber(num)+" ");
             num=nextNumber(num);
         }
     }
    public class ArrayExample {
        public static void main(String[] args) {
            int [] input = new int[5];
            for(int i = 0; i < 5; i++){
                input[i] = i + 1;
            }
        }
    }

     public static int nextNumber(int n) {
         if(n %2==0){
             return n/2;
         }
         return 3*n+1;
     }
}
