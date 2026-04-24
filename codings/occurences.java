public class occurences {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        //int[] num= new int[arr.length];

        int end= arr.length;
        for(int i=0 ; i<end ;i++) {
            if(arr[i]==-1) continue;
            int temp=1;
            for (int j = i+1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    temp++;
                    arr[j]=-1;
                }
            }
            System.out.println(arr[i] + " = " + temp);

        }
    }
}
