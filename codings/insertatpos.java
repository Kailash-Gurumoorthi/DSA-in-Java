public class insertatpos {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        int target = 8,pos=4;
        int[] newarr = new int[arr.length+1];
        System.arraycopy(arr,0,newarr,0,pos);
        newarr[pos]=target;
        System.arraycopy(arr,pos,newarr,pos+1,arr.length-pos);
            for(int i=0;i<newarr.length;i++) {
                System.out.print(newarr[i] + " ");
            }
    }
}
