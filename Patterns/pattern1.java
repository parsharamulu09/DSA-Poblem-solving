
/*
   * * * *
   * * * *
   * * * *
   * * * *

   */ 

package Patterns;
import java.util.*;

public class pattern1 {
    public static void pattern(int n){
        for (int i = 0; i <n; i++) {
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            pattern(n);
            System.out.println();
        }
    }
}
