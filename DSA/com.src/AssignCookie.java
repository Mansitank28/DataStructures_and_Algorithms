import java.util.Arrays;

public class AssignCookie {

    public static void main(String[] args) {

        int[] g={1,2,3};
        int[] s={1,1};

        Arrays.sort(g);
        Arrays.sort(s);

        int childIndex =0;
        int cookieIndex =0;
        //assign cookie
        while(childIndex < g.length && cookieIndex < s.length){
            if(s[cookieIndex] >= g[childIndex]){
                childIndex ++;
            }
            //always move next cookie
            cookieIndex ++;

        }
        System.out.println(childIndex);

    }
}
