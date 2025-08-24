/*  1
    1 2 3 
    1 2 3 4
    1 2 3 4 5
 */
package Patterns;
import java.util.*;
public class pattern3 {
    public static void pattern33(int N){
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            pattern33(N);
            System.out.println();
        }
    }
}
