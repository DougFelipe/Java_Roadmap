
/*
Retornando Objetos de Métodos:
Métodos podem retornar objetos.

Explicação:
No exemplo abaixo, temos uma classe 'Shop' com um método 'getProduct'. O método 'getProduct' 
retorna um objeto da classe 'Product'.
*/

class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }

    void display() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

public class ReturningObjects {

    public Product getProduct() {
        Product p = new Product("Laptop", 800.0);
        return p;
    }

    public static void main(String[] args) {
        ReturningObjects shop = new ReturningObjects();
        Product product = shop.getProduct();
        product.display();
    }
}
