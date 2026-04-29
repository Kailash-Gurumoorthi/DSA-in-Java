import java.util.ArrayList;
import java.util.List;

public class multioccurence {
    public static void main(String[] args){
        int[] arr={3,5,6,7,2,1,3,234,24,2,2,4,};
        int t=2,i=0;
        List<Integer> result=new ArrayList<>();
        ArrayList<Integer> occu=new ArrayList<>();
        result = search(arr,t,i,occu);
        System.out.println(result);
    }
    public static ArrayList<Integer> search(int[] arr,int t,int i,ArrayList<Integer> occu){

          if(i == arr.length-1){
              return occu;
        }else if(arr[i]==t){
              occu.add(i);
          }
          return search(arr,t,i+1,occu);
    }

}
