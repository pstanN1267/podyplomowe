package zjazd3.OverloadingAndRidding;

public class PriceFormatter {

    String currency = "zł";

    private String formatPrice(int value) {
        return String.format("%d,00 %s", value, currency); // %d od double, dlatego 00, i %s od stringa
    }

    private String formatPrice(double value) {
        return String.format("%.2f %s", value, currency); // %.2f odpowiada za floata
    }

    private String formatPrice(String value) {
//        return String.format("%.2f %s", Double.parseDouble(value), currency); // %.2f odpowiada za floata
        return this.formatPrice(Double.parseDouble(value));
    }
    public static void main(String[] args) {
        PriceFormatter pf = new PriceFormatter();
        pf.currency = "PLN";
        System.out.println(pf.formatPrice(500));
        System.out.println(pf.formatPrice(89.9934));
        System.out.println(pf.formatPrice("500.50"));


    }
}
