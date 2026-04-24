public class largestnum {
    public static void main(String[] args){
        int[] arr={7,4,39,8,92,5};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}
