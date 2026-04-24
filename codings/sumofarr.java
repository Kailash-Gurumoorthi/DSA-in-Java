public class sumofarr {
    public static void main(String[] args){
        int[] arr = {1,2,1,1,5,1};
        float sum= sum(arr);
        float avg = sum/arr.length;
        System.out.print(avg);
    }
    public static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}

