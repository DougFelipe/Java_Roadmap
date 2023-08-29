
/*
Uso de `this` em Polimorfismo:
A palavra-chave `this` refere-se ao objeto atual. Pode ser usada para referenciar membros da classe ou chamar construtores 
sobrecarregados.

Explicação:
Neste exemplo, temos uma classe 'RectangleThis' que usa a palavra-chave `this` para diferenciar entre parâmetros de 
construtor e variáveis de instância.
*/

class RectangleThis {
    int x;
    int y;

    RectangleThis(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Width: " + x + ", Height: " + y);
    }
}

public class ThisUsage {
    public static void main(String[] args) {
        RectangleThis rect = new RectangleThis(10, 20);
        rect.display();
    }
}

