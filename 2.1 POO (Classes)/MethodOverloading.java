
/*
Sobrecarga de Métodos:
Permite que uma classe tenha mais de um método com o mesmo nome, mas com diferentes 
listas de parâmetros.

Explicação:
No exemplo abaixo, a classe 'MethodOverloading' tem dois métodos 'display' com diferentes 
listas de parâmetros. Um aceita um 'String' e o outro aceita um 'int'.
*/

public class MethodOverloading {

    // Método 'display' que aceita um parâmetro 'String'
    void display(String name) {
        System.out.println("Name: " + name);
    }

    // Método 'display' sobrecarregado que aceita um parâmetro 'int'
    void display(int age) {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        MethodOverloading example = new MethodOverloading();
        example.display("Alice");
        example.display(25);
    }
}
