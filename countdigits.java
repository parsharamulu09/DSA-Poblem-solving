import java.util.*;

public class countdigits{
    public static int count(int n){
        int count=0;
        if(n==0) return 1;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int res=count(n);
    System.out.println(res);
}
}