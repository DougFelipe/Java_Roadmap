
/*
Construtores:
Um construtor é um método especial usado para inicializar objetos. O construtor é chamado 
quando um objeto da classe é criado.

Explicação:
No exemplo abaixo, a classe 'Book' possui um construtor que aceita dois parâmetros, 
'title' e 'author', para inicializar os atributos do objeto.
*/

public class Constructors {
    String title;
    String author;

    // Construtor da classe
    public Constructors(String bookTitle, String bookAuthor) {
        this.title = bookTitle;
        this.author = bookAuthor;
    }

    public void displayBookInfo() {
        System.out.println("Book Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Constructors myBook = new Constructors("The Great Gatsby", "F. Scott Fitzgerald");
        myBook.displayBookInfo();
    }
}
