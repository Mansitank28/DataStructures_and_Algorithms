//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public interface BestTimeToBuyAndSellStock {
    static void main(String[] args) {
        int[] price = new int[]{7, 6, 4, 3, 1};
        int buy = price[0];
        int profit = 0;

        for(int i = 1; i < price.length; ++i) {
            if (price[i] < buy) {
                buy = price[i];
            } else if (price[i] - buy > profit) {
                profit = price[i] - buy;
            }
        }

        System.out.println(profit);
    }
}
