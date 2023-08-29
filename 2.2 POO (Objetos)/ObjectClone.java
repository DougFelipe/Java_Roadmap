
/*
Objeto Clone:
Criar um objeto duplicando um objeto existente é conhecido como clonagem. 
O método 'clone' da classe 'Object' é usado para clonar objetos.

Explicação:
No exemplo abaixo, temos uma classe 'Book' que implementa a interface 'Cloneable'. 
Criamos um clone do objeto 'book1' usando o método 'clone'.
Nota: A implementação de clonagem neste exemplo é rasa.
*/

class Book implements Cloneable {
    String title;

    Book(String t) {
        title = t;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void displayTitle() {
        System.out.println("Book Title: " + title);
    }
}

public class ObjectClone {

    public static void main(String[] args) {
        try {
            Book book1 = new Book("The Great Gatsby");
            Book book2 = (Book) book1.clone();  // Clonando o objeto book1

            book2.displayTitle();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
