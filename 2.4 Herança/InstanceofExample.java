
/*
Uso do `instanceof` com Herança:
O operador `instanceof` é usado para testar se um objeto é uma instância de uma classe específica ou 
se é uma instância de uma subclasse de uma classe.

Explicação:
Neste exemplo, temos uma superclasse 'Vehicle' e duas subclasses 'Car' e 'Bike'. Usamos o operador `instanceof` 
para verificar o tipo real do objeto durante a execução.
*/

class Vehicle {
    void displayType() {
        System.out.println("It's a vehicle.");
    }
}

class CarInstanceof extends Vehicle {
    @Override
    void displayType() {
        System.out.println("It's a car.");
    }
}

class Bike extends Vehicle {
    @Override
    void displayType() {
        System.out.println("It's a bike.");
    }
}

class InstanceofExample {
    public static void main(String[] args) {
        Vehicle myCar = new CarInstanceof();
        Vehicle myBike = new Bike();
        
        if (myCar instanceof CarInstanceof) {
            myCar.displayType();
        }

        if (myBike instanceof Bike) {
            myBike.displayType();
        }
    }
}

