public class smallestnum {
    public static void main(String[] args) {
        int[] arr = {2, 5,  3, 6};
        int min = arr[0];
        for (int i = 1;i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print(min);
    }
}
