import java.util.Arrays;

public class CapacityToShipPackagesWithinDDays_BS {

    public static void main(String[] args) {


        int weights[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        int ans = shipWithinDays(weights, days);
        System.out.println("=======  "+ans);
    }

    //Time complexity -  logerithmic of log2(sum-max +1) * big O(N)
    //Sc = O(1);
    private static int shipWithinDays(int[] weights, int days) {
        // start looking for 10 (Range 10 to 55 (Sum of all))

        int low = Arrays.stream(weights).max().getAsInt();
        int high =  Arrays.stream(weights).sum();

        while(low <= high){

            int mid = (low + high) /2;
            int daysReq = daysNeeded(weights, mid);
            if(daysReq <= days)
                high = mid-1;
            else
                low = mid+1;
        }
        //should never reach this constraints
        return low;
    }

    private static int daysNeeded(int[] weights, int capacity) {

        int days =1, load =0;

        for (int i=0; i<= weights.length-1; i++){

            //loading into the ship is crossing my capacity into the ship next day load
            if(load + weights[i] > capacity){

                //go to next days
                days = days + 1;
                load = weights[i];
            }
            //if load is not exceed then whatever loaded into the same day
            else{
                load += weights[i];
            }
        }
        return days;
    }
}
