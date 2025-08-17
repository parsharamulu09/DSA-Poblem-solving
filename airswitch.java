import java.util.*;
public class airswitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        switch (x+y) {
            case 10:
                System.out.println("10");
                break;
            case 15:
                System.out.println("15");
                break;
            case 20:
                System.out.println("15");
                break;
            default:
            System.out.println("invalid");
                break;
        }
    }
}
