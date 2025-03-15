package String;

public class Palindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean result = palindrom(s);
        System.out.println(result);
    }
    private static boolean palindrom(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left=0;
        int right = s.length()-1;
        while(left < right){
            if((s.charAt(left)) != (s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
