
/*
Polimorfismo em Tempo de Execução:
Também conhecido como polimorfismo dinâmico. Em tempo de execução, a JVM determina o objeto a ser chamado com base na 
referência do objeto real.

Explicação:
Neste exemplo, 'Vehicle' é uma superclasse e 'Car' e 'Bike' são suas subclasses. Ambas as subclasses têm uma implementação 
do método 'fuel'. Em tempo de execução, a JVM usa o polimorfismo para determinar qual método 'fuel' chamar.
*/

class Vehicle {
    void fuel() {
        System.out.println("Vehicle uses fuel");
    }
}

class CarRuntime extends Vehicle {
    @Override
    void fuel() {
        System.out.println("Car uses petrol or diesel");
    }
}

class Bike extends Vehicle {
    @Override
    void fuel() {
        System.out.println("Bike uses petrol");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Vehicle myVehicle = new CarRuntime();
        myVehicle.fuel();

        myVehicle = new Bike();
        myVehicle.fuel();
    }
}

