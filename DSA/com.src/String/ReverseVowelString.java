package String;

public class ReverseVowelString {

    public static void main(String[] args) {

        String s = "IceCreAm";
        String result = reverseVowels(s);
    }

    private static String reverseVowels(String s) {
        int left =0;
        int right = s.length()-1;

        char word[] = s.toCharArray();
        while(left < right){

            char ch = s.charAt(left);
            char ch1 = s.charAt(right);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch == 'u'){
                if(ch1 == 'a' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'){

                    String resultStr = swaping(s,ch, ch1);
                }

            }

        }

        return null;
    }

    private static String swaping(String s, char ch, char ch1) {

        int temp = ch[ch];

    }
}
