public class second {
    public static void main(String[] args){
        int[] arr={1};

        int s = Integer.MAX_VALUE;
        int ss= Integer.MAX_VALUE;
        int l=Integer.MIN_VALUE;
        int sl= Integer.MIN_VALUE;

        for(int num : arr ){
            if(num<s){
                ss=s;
                s=num;
            } else if (num<ss && num !=s){
                ss=num;
            }
        }
        System.out.println(ss);
        for(int num : arr){
            if(num>l){
                l=sl;
                l=num;
            }else if(num>sl && num!= l){
                sl=num;
            }
        }
        System.out.print(sl);
    }
}
