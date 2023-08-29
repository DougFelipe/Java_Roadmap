
/*
Criação de Objetos:
Os objetos são criados usando a palavra-chave 'new' seguida de um construtor da classe.

Explicação:
No exemplo abaixo, temos uma classe 'Vehicle'. O objeto 'car' é criado usando 
a palavra-chave 'new' seguida do construtor padrão da classe 'Vehicle'.
*/

public class ObjectCreation {
    String type;
    int speed;

    public void displayDetails() {
        System.out.println("Vehicle Type: " + type + ", Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        ObjectCreation car = new ObjectCreation();
        car.type = "Sedan";
        car.speed = 80;
        car.displayDetails();
    }
}
