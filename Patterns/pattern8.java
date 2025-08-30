/*
    * * *  * *  * * * *
      * * * *  * * * 
        * * * * *
          * * *
            *
 */
import java.util.*;
public class pattern8 {
    public static void pattern88(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*(n-i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while (T-->0) {
            int n=sc.nextInt();
            pattern88(n);
            System.out.println();
        }
    }
}
