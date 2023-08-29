
/*
Acesso aos Membros do Objeto:
Os membros (atributos e métodos) de um objeto podem ser acessados usando o operador '.'.

Explicação:
No exemplo abaixo, temos uma classe 'Laptop'. O objeto 'myLaptop' é uma instância 
dessa classe. Acessamos o atributo 'brand' e o método 'displaySpecs' do objeto 
usando o operador '.'.
*/

public class ObjectMemberAccess {
    String brand;
    int memory;

    public void displaySpecs() {
        System.out.println("Brand: " + brand + ", Memory: " + memory + " GB");
    }

    public static void main(String[] args) {
        ObjectMemberAccess myLaptop = new ObjectMemberAccess();
        myLaptop.brand = "Dell";
        myLaptop.memory = 16;
        myLaptop.displaySpecs();
    }
}
