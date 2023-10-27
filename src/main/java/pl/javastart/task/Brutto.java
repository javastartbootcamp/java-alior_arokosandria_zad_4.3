package pl.javastart.task;

public class Brutto {
    double priceBrutto(Product product) {
        double price;
        if (product.getCategory() == null) {
            price=product.getPrice() * 0.03 + product.getPrice();
        } else {
            switch (product.getCategory()) {
                case "Zabawki":
                    price=product.getPrice() * 0.23 + product.getPrice();
                    break;
                case "Owoce":
                    price=product.getPrice() * 0.08 + product.getPrice();
                    break;
                default:
                    price=product.getPrice() * 0.03 + product.getPrice();
            }
        }
        return price;
    }
    void showBruttoPrice(Product product){
        System.out.println("Cena brutto wynosi: "+priceBrutto(product));
    }
}
