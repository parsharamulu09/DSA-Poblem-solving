import java.util.*;
import java.util.Scanner;
public class printalldivisors {
    public static void printDivisors(int n){
        List<Integer> divisor=new ArrayList<>();
        for (int i = 1; i*i<n; i++) {
            if(n%i==0){
                divisor.add(i);
                if((n/i)!=i){
                    divisor.add(n/i);
                }
            }
        }
        Collections.sort(divisor);
        for(int divisors:divisor){
            System.out.println(divisors+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            printDivisors(n);
        }
}
