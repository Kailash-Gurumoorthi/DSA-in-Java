import java.util.*;
public class Parking {
    public static void main(String[] Args){
        Scanner in =new Scanner(System.in);
        int a;
        System.out.print("enter parking time in hrs");
        a = in.nextInt();
        System.out.print("fine = " + fine(a));
    }
    public static int fine(int a){
        int d = 0;
        int x=2,y=5;
        if (a<=x){
            d=100;
        } else if(a>=x && a<=y){
            d= 50;
        }else d= 20;

        return d;
    }
}
