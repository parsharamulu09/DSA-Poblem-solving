/*  *
    * *
    * * *
    * * * *
    * * * * *
 */

package Patterns;
import java.util.*;

public class pattern2 {
    public static void pattern22(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            pattern22(n);
            System.out.println();
        }
    }
}
