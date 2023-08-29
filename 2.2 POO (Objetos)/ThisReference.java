
/*
Referência `this` em Objetos:
Dentro de um método de instância, 'this' é uma referência ao objeto atual.

Explicação:
No exemplo abaixo, temos uma classe 'Box'. Usamos a referência 'this' para diferenciar 
entre os atributos da classe e os parâmetros do construtor.
*/

public class ThisReference {
    double width;
    double height;

    public ThisReference(double width, double height) {
        this.width = width;   // 'this.width' refere-se ao atributo, 'width' refere-se ao parâmetro
        this.height = height; // 'this.height' refere-se ao atributo, 'height' refere-se ao parâmetro
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        ThisReference box = new ThisReference(5.0, 3.0);
        System.out.println("Area of box: " + box.getArea());
    }
}
