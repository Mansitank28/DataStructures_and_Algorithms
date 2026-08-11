import java.util.Arrays;

public class FindMinimumNumberOfDaysToMakeBouquets {

    public static void main(String[] args) {

        int bloomDays[] = {7,7,7,7,13,11,12,7};
        int k=3;
        int m=2;

        int minDays = minDaysToMakeBouquets(bloomDays, m, k);
        System.out.println("==== "+minDays);
    }
//Brute Force Solution
    private static int minDaysToMakeBouquets(int[] bloomDays, int m, int k) {

        long totalFlowers = (long)m*k;
        // this condition is not possible case
        if(totalFlowers >= bloomDays.length)
            return -1;

        int min = Arrays.stream(bloomDays).min().getAsInt();
        int max = Arrays.stream(bloomDays).max().getAsInt();
//this case is possible case
        for(int i= min; i<= max; i++){

            if(isPossible(bloomDays,i,m,k)){
                return i;
            }
        }
        return -1;
    }

    private static boolean isPossible(int[] bloomDays, int i, int m, int k) {

            int count=0;
            int noOfBouquets=0;

            for(int bloom : bloomDays){

                if(bloom <= i){

                    count ++;
                }else{
                    noOfBouquets += (count/k);
                    count=0;
                }
            }
            noOfBouquets += (count/k);
            if(noOfBouquets >= m)
                return true;
            else
                return false;
    }
}
