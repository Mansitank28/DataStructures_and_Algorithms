public class FindSureRootofANumberBruteForce {

    public static void main(String[] args) {

        int n=36;
        int result = SqureRoot(n);

        System.out.println(result);
    }

    private static int SqureRoot(int n) {

        int ans =1;
        for(int i=0;i<n;i++){
            if(i*i <= n){
                ans = i;
            }else
                break;
        }
        return ans;
    }
}
