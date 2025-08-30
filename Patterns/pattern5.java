/*
    * * * * *
    * * * *
    * * *
    * *
    *
 */




import java.util.*;
public class pattern5 {
    public static void pattern55(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            pattern55(n);
            System.out.println();
        }
    }
}
