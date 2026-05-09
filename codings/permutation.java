public class permutation {
    public static void main() {
    String word="abc";
    permutations("",word);
    }
    static void permutations(String output,String word){
        if(word.isEmpty()){
            System.out.println(output);
            return;
        }
        char ch = word.charAt(0);
        for(int i=0;i<=output.length();i++){
            String f=output.substring(0,i);
            String s=output.substring(i,output.length());
            permutations(f+ch+s,word.substring(1));
        }
    }
}
