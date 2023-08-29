
/*
Encapsulamento e Composição:
O encapsulamento pode ser usado junto com a composição para criar sistemas robustos, 
onde componentes individuais são bem encapsulados e interagem uns com os outros.

Explicação:
No exemplo abaixo, temos duas classes 'Engine' e 'Car'. A classe 'Car' possui um objeto 'Engine', 
demonstrando composição. Ambos os atributos nas classes são privados e acessados usando getters e setters.
*/

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class EncapsulationCompositionExample {
    private String brand;
    private Engine engine;

    public EncapsulationCompositionExample(String brand, String engineType) {
        this.brand = brand;
        this.engine = new Engine(engineType);
    }

    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public static void main(String[] args) {
        EncapsulationCompositionExample car = new EncapsulationCompositionExample("Toyota", "Hybrid");
        System.out.println("Brand: " + car.getBrand() + ", Engine Type: " + car.getEngine().getType());
    }
}

