
/*
Agregação e Composição:
São formas de associação que representam relacionamentos do tipo "tem um". 
A agregação é uma associação representando uma relação entre duas classes 
que é melhor descrita como "tem um", mas é uma associação fraca. A composição 
é uma associação representando uma relação entre duas classes que é melhor 
descrita como "tem um" e tem uma associação mais forte.

Explicação:
No exemplo abaixo, temos duas classes: 'Engine' e 'Car'. A classe 'Car' tem um 
'Engine', representando uma composição, porque um carro não pode existir sem um motor.
*/

class Engine {
    String type;

    Engine(String t) {
        type = t;
    }
}

class CarWithEngine {
    String model;
    Engine engine;  // Composição entre Car e Engine

    CarWithEngine(String m, Engine e) {
        model = m;
        engine = e;
    }

    void displayDetails() {
        System.out.println("Car Model: " + model + ", Engine Type: " + engine.type);
    }
}

public class AggregationComposition {

    public static void main(String[] args) {
        Engine engine = new Engine("Diesel");
        CarWithEngine car = new CarWithEngine("SUV", engine);
        car.displayDetails();
    }
}
