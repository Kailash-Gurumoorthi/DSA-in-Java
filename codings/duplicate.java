public class duplicate {
    public static void main(String[] args){
        int[] arr={1,1,1,2,2,3,3,3,3,4,4};
        int k=find(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i] +" ");
        }
        
    }
    public static int find(int[] arr){
        int n= arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;

    }
}
