public class TASK4 {
    public static void main(String[] args) {
        double amount = 100; // input amount
        String baseCurrency = "USD"; // base currency
        String targetCurrency = "EUR"; // target currency
        double exchangeRate = 0.83; // exchange rate from USD to EUR

        double convertedAmount = convert(amount, baseCurrency, targetCurrency, exchangeRate);
        System.out.println(amount + " " + baseCurrency + " is " + convertedAmount + " " + targetCurrency);
    }

    public static double convert(double amount, String baseCurrency, String targetCurrency, double exchangeRate) {
        return amount * exchangeRate;
    }
}