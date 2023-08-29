
/*
Uso de Métodos private:
Métodos private ajudam a encapsular a lógica interna de uma classe e são úteis para operações auxiliares.

Explicação:
No exemplo abaixo, temos uma classe 'PrivateMethodsExample' que possui um método private 'calculateArea'.
Este método é usado internamente por outro método 'displayArea' para calcular e exibir a área de um círculo.
*/

class PrivateMethodsExample {
    private double radius;

    public PrivateMethodsExample(double radius) {
        this.radius = radius;
    }

    private double calculateArea() {
        return 3.141592653589793 * radius * radius;
    }

    public void displayArea() {
        double area = calculateArea();
        System.out.println("Area of circle with radius " + radius + " is: " + area);
    }

    public static void main(String[] args) {
        PrivateMethodsExample circle = new PrivateMethodsExample(5);
        circle.displayArea();
    }
}

