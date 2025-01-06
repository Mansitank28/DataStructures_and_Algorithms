public interface BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] price ={7,1,5,3,6,4};
    //    int[] price= {7,6,4,3,1};
        int buy = price[0];
        int profit = 0;

        for(int i=1; i<price.length; i++){
            if(price[i] < buy){
                buy = price[i];
            }else if(price[i]- buy > profit){
                    profit = price[i]-buy;
            }
        }
        System.out.println(profit);
    }
}
