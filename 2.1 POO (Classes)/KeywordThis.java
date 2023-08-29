
/*
Palavra-chave 'this':
É usada para referenciar a instância atual de um objeto para diferenciar os atributos 
da classe dos parâmetros do construtor ou método.

Explicação:
No exemplo abaixo, a classe 'Rectangle' tem um construtor que aceita dois parâmetros 
'length' e 'width'. Usamos a palavra-chave 'this' para diferenciar entre o atributo 
da classe e o parâmetro do construtor.
*/

public class KeywordThis {
    int length;
    int width;

    public KeywordThis(int length, int width) {
        this.length = length; // 'this.length' refere-se ao atributo, 'length' refere-se ao parâmetro
        this.width = width;   // 'this.width' refere-se ao atributo, 'width' refere-se ao parâmetro
    }

    public int getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        KeywordThis rectangle = new KeywordThis(10, 5);
        System.out.println("Area of rectangle: " + rectangle.getArea());
    }
}
