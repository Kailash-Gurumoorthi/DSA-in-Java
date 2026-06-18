package temptrash;

class anagram{
    public static void main(String[] args){
        String s = "tea";
        String t = "ewt";
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            if(s.length() != t.length()){
                System.out.print("false");
                return;
            }
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);
            arr[ch - 'a']++;
            arr[ch1 - 'a']--;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j] != 0){
                System.out.print("false");
                return;
            }else{
                System.out.print("true");
                return;
            }
        }
    }
}