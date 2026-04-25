public class pattern {
    public static void main(String[] args){
        int rows=3;
        pattern5(rows);
    }
    public static void pattern1(int rows){
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int rows){
        for(int i =0;i<rows;i++){
            for(int j =0;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int rows){
        for(int i=0;i<rows;i++){
            for(int j=rows ;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int rows){
        for(int i=0;i<=rows;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int rows){

        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<rows;i++){
            for(int j=rows ;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
