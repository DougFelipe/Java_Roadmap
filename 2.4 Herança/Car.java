
/*
Classe Base (Superclasse) e Classe Derivada (Subclasse):
Na herança, a classe da qual outra classe herda é chamada de superclasse ou classe base, enquanto 
a classe que herda é chamada de subclasse ou classe derivada.

Explicação:
Neste exemplo, 'Vehicle' é a superclasse e 'Car' é a subclasse. A subclasse 'Car' herda o atributo 'speed' 
e o método 'displaySpeed' da superclasse 'Vehicle'. Além disso, a subclasse 'Car' tem seu próprio atributo 'brand'.
*/

class Vehicle {
    int speed = 50;
    
    void displaySpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String brand = "Toyota";
    
    void displayCarDetails() {
        System.out.println("Brand: " + brand);
        displaySpeed();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.displayCarDetails();
    }
}

