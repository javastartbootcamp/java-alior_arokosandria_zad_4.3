package pl.javastart.task;

public class Brutto {
    void priceBrutto(Product product) {
        if (product.getCategory() == null) {
            product.setPrice(product.getPrice() * 0.03 + product.getPrice());
            System.out.println("Produkt bez kategorii ma 3% VAT cena produktu brutto to: " + product.getPrice());
        } else {
            switch (product.getCategory()) {
                case "Zabawki":
                    product.setPrice(product.getPrice() * 0.23 + product.getPrice());
                    System.out.println("Zabawki mają 23% VAT cena produktu brutto to: " + product.getPrice());
                    break;
                case "Owoce":
                    product.setPrice(product.getPrice() * 0.08 + product.getPrice());
                    System.out.println("Owoce mają 8% VAT cena produktu brutto to: " + product.getPrice());
                    break;
                default:
                    product.setPrice(product.getPrice() * 0.03 + product.getPrice());
                    System.out.println("Reszta produktów ma 3% VAT cena produktu brutto to: " + product.getPrice());
            }
        }
    }
}
