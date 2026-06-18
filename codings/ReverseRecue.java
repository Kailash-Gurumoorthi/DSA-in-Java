public class ReverseRecue {
    //Reverse a number using Recursion
    public static void main(String[] args){
        int num=10872;
        recur(num);
    }
    public static void recur(int num){
      if(num<10){
          System.out.print(num);
          return;
      }
      System.out.print(num%10);
      recur(num/10);
    }
}
