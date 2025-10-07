import java.util.*;
public class armstrong {
    public static boolean armst(int n){
        int org=n;
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
            n=n/10;
            

        }
        return sum==org;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        if(armst(n)){
            System.out.println("it is an armstrong");
        }else{
            System.out.println("it is not a armstrong");
        }
    }
}
