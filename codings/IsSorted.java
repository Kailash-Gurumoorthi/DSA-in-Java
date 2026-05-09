public class IsSorted {
    public static void main(String[] args){
    int[] arr={0,0,1,3,25,634,634,635};
    System.out.println(check(arr));
    int index=0;
    System.out.print(checkrecur(arr,index));

    }
    //not recur
    public static boolean check(int[] arr){

        int f=arr.length;
        for(int i=1;i<f;i++) {
            if (arr[i] > arr[i - 1]) {
                return true;
            }
        }
        return false;
    }
    //recur
    public static boolean checkrecur(int[] arr,int index){
        if(index==arr.length-1) return true;
        return arr[index]<=arr[index+1] && checkrecur(arr,index+1);
    }
}
