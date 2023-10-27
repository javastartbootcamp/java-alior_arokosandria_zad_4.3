package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Resorak");
        product.setDescribe("dla małych dzieci");
        product.setPrice(100.00);
        product.setCategory("Zabawki");
        Product product1 = new Product();
        product1.setName("Granat");
        product1.setDescribe("egzotyczy");
        product1.setPrice(100.00);
        product1.setCategory("Owoce");
        Product product2 = new Product();
        product2.setName("Stół");
        product2.setDescribe("do pokoju");
        product2.setPrice(100.00);
        Brutto brutto = new Brutto();
        brutto.priceBrutto(product2);

    }
}
