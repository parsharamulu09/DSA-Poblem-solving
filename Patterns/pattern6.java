/*
    1 2 3 4 5 
    1 2 3 4 
    1 2 3 
    1 2 
    1
 */


import java.util.*;
public class pattern6 {
    public static void pattern66(int n){
        for (int i = 1; i <=n; i++) {
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            pattern66(n);
            System.out.println();
        }
    }
}
