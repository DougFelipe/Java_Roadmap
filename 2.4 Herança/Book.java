
/*
Classe `Object` - A Raiz de Todas as Classes:
Em Java, todas as classes herdam implicitamente da classe `Object`, que é a superclasse de todas as classes em Java.

Explicação:
Neste exemplo, a classe 'Book' herda implicitamente da classe `Object`. Demonstramos isso chamando o método `toString` 
(sem sobrescrevê-lo), que é um método da classe `Object`.
*/

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        System.out.println(book.toString());  // Calling the Object's toString method
    }
}

