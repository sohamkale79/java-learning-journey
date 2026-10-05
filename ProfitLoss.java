 class ProfitLoss {
    public static void main(String[] args) {
        int cost_price = 500;
        int selling_price = 650;

        if (selling_price > cost_price) {
            System.out.println("Profit = " + (selling_price - cost_price));
        } else {
            System.out.println("Loss = " + (cost_price - selling_price));
        }
    }
}