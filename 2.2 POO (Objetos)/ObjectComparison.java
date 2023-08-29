
/*
Comparação de Objetos:
Os objetos podem ser comparados usando métodos como 'equals()' e 'hashCode()'.

Explicação:
No exemplo abaixo, temos uma classe 'Circle' que redefine o método 'equals' para 
comparar dois objetos 'Circle' com base em seu raio. Também redefine o método 'hashCode'.
*/

class Circle {
    int radius;

    Circle(int r) {
        radius = r;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle circle = (Circle) obj;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(radius).hashCode();
    }
}

public class ObjectComparison {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);

        System.out.println("circle1 equals circle2? " + circle1.equals(circle2));
        System.out.println("circle1 equals circle3? " + circle1.equals(circle3));
    }
}
