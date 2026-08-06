public class FindSqureRootOfIntegerBs {

    public static void main(String[] args) {

        int n = 36;
        int ans = squreRoot(n);
        System.out.println("= "+ans);

    }
    private static int squreRoot(int n) {
        int ans =1;
        int low =1, high =n;
        while(low <= high){
            int mid = (low+high) /2;

            if(mid * mid <= n ){
                ans = mid;
                low = mid+1;
            }else
                high = mid-1;
        }
        return ans;
    }
}
