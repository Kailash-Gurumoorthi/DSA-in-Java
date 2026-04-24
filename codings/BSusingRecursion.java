public class BSusingRecursion {
    public static void main(String[] args){
        int[] arr ={2,4,5,6,7,8,93,453,5345};
        int t=7;//s=0,e =arr.length-1;
        System.out.print(ans(arr,t,0,arr.length-1));
    }
    public static int ans(int[] arr,int t,int s,int e){
        int m= s+ (e-s)/2;
        if(s>e) return -1;
        if(arr[m]== t) return m;
        if(arr[m]<t){
            return ans(arr,t,m+1,e);
        }else{
            return ans(arr,t,s,m-1);
        }
    }
}
