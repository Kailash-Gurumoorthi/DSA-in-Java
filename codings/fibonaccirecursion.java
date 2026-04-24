import java.util.*;
public class fibonaccirecursion {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(Fibo(num));
    }
    public static int Fibo(int num){
        if(num<=1) return num;
        return Fibo(num-1)+Fibo(num-2);
        }
}
