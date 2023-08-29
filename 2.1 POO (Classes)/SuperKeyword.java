
/*
Palavra-chave 'super':
É usada para referenciar a classe pai imediata de uma classe. Pode ser usada para 
chamar o construtor da classe pai ou para se referir a membros da classe pai.

Explicação:
No exemplo abaixo, temos uma superclasse 'Parent' e uma subclasse 'Child'. A subclasse 
'Child' usa a palavra-chave 'super' para chamar o construtor da superclasse e também 
para se referir ao método 'display' da superclasse.
*/

class Parent {
    String message = "Hello from Parent class";

    void display() {
        System.out.println(message);
    }
}

public class SuperKeyword extends Parent {

    String message = "Hello from Child class";

    void display() {
        System.out.println(message);
        super.display();  // Chama o método 'display' da superclasse
    }

    SuperKeyword() {
        super();  // Chama o construtor da superclasse
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {
        SuperKeyword child = new SuperKeyword();
        child.display();
    }
}
