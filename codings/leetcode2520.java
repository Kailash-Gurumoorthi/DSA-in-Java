class leetcode2520 {
    public static void main(String[] args){
        int num =121;
        System.out.print(countDigits(num));
    }
    public static int countDigits(int num) {

        int count =0;
        int size =0;
        int x =num;
        if((x/10) == 0){
            return 1;
        }
        while(x!=0){
            x=x/10;
            size+=1;
        }
        int y= num;
        while(size!=0){
            int temp1 =y%10;
            if((num % temp1) == 0){
                count+=1;
            }
            y=y/10;
            size--;
        }
        return count;
    }
}