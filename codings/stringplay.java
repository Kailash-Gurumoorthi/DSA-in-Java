import java.util.Arrays;
class stringplay{
    public static void main(String[] args){

        String word = "abc";

        check(word);
        //remove(word,'a');
        //substring(word);

       // subsequence(word,"");

    }
    //check palindrome or not
    static void check(String word){
        boolean t = true;
        int start =0,end =word.length()-1;
        while(start <= end){
            char a = word.charAt(start);
            char b = word.charAt(end);
            if(a==b){
                t= true;
            }else{
                t=false;
                break;
            }
            start++; end--;
        }
        System.out.print(t);
    }
    // remove a specific letter from the word
    static void remove(StringBuilder word,char letter){
        for(int i = 0 ; i<word.length() ; i++){
            if(letter == word.charAt(i)){
                word.deleteCharAt(i);
            }
        }
    }
    // just checking what .substring(); do
    static void substring(StringBuilder word){
        System.out.println(word.substring(1,4));
    }
    // subsquence or permutation
    static void subsequence (String word,String output){
        if(word.isEmpty()){
            System.out.println(output);
            return;
        }

        subsequence(word.substring(1),output );
        subsequence(word.substring(1),output + word.charAt(0));
    }

}