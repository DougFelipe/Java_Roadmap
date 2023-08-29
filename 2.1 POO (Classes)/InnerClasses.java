
/*
Classes Aninhadas ou Internas:
Java permite definir uma classe dentro de outra classe. Essas classes são conhecidas como 
classes internas ou aninhadas.

Explicação:
No exemplo abaixo, temos uma classe externa 'OuterClass' e uma classe interna 'InnerClass'. 
A classe interna pode acessar membros da classe externa, mesmo que sejam privados.
*/

public class InnerClasses {

    private String msg = "Hello from OuterClass";

    // Classe interna
    class InnerClass {
        void display() {
            System.out.println(msg);  // Pode acessar o membro privado da classe externa
        }
    }

    public static void main(String[] args) {
        InnerClasses outer = new InnerClasses();
        InnerClasses.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
