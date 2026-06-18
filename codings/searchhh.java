public class searchhh {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int t=4;
        search(arr,t);
    }
    static void search(int[] arr,int t){
        int s =0,e= arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]== t){
                System.out.println(mid);
            }
            if(t<arr[mid]){
                e=mid-1;
            }else s=mid+1;
        }
    }
}
