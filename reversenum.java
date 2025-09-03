import java.util.*;

public class reversenum {
    public static int rev(int x){
        int revnum=0;
        while (x>0) {
            int lastdigits=x%10;
            x=x/10;
            revnum=((revnum*10)+lastdigits);
        }
        return revnum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int res=rev(x);
        System.out.println(res);
    }
}
