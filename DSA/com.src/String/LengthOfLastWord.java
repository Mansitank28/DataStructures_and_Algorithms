package String;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String str = "Hello World";
        int end =  str.length()-1;

        while(end >= 0 && str.charAt(end) == ' '){
            end --;
        }
        int start = end;
        while(start >= 0 && str.charAt(start) != ' '){
            start--;
        }
        System.out.println(end-start);
    }
}
