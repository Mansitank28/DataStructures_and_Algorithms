import java.util.Arrays;

public class CapacityToShipPackagesWithinDDays_BF {

    public static void main(String[] args) {

        int weights[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        int ans = shipWithinDays(weights, days);
        System.out.println("=======  "+ans);

    }

    //Time Complexity - go to max to sum O(Sum-max)+1 * Big O of(N) this is length
    //linear into linear - near about Quadratic ~- time Complexity
    //Brute Force technic
    private static int shipWithinDays(int[] weights, int days) {
       // start looking for 10 (Range 10 to 55 (Sum of all))

        //find the maximum weight
        int max = Arrays.stream(weights).max().getAsInt();
        //total number of sums
        int sumofElements = Arrays.stream(weights).sum();

        //cap go to start 10 to till max till sums increasing order
        for(int capacity =max; capacity <= sumofElements; capacity++){

            int daysReq = daysNeeded(weights, capacity);
            if(daysReq <= days)
                return capacity;
        }
        //should never reach this constraints
        return sumofElements;
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
