public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        if(s.length()!=t.length()){
            System.out.println("Not an anagram");
            return;
        }

        int[] counter=new int[26];
        for(int i=0;i<26;i++){
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }
        for(int count:counter) {
            if (count != 0) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("true");

    }
}
