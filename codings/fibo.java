public class fibo {
    public static void main(String[] args){
        int n = 29;
        System.out.println(fibonacci(n));
    }
    static long fibonacci(int n){
        if( n < 0 ){
            throw new IllegalArgumentException("no negative nums");
        }
        if(n==0) return 0;
        if(n==1) return 1;
        long a =0;
        long b= 1;
        long current =0;
        for(int i =2; i<=n ; i++){
            current = a+b;
            a=b;
            b=current;
        }
        return current;
    }
}
