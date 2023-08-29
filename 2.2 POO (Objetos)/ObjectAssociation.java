
/*
Associação entre Objetos:
Refere-se à relação entre múltiplos objetos. Pode ser unidirecional ou bidirecional.

Explicação:
No exemplo abaixo, temos duas classes: 'Author' e 'Book'. Cada 'Book' tem um 'Author', 
representando uma associação unidirecional.
*/

class Author {
    String name;

    Author(String n) {
        name = n;
    }
}

class BookWithAuthor {
    String title;
    Author author;  // Associação entre Book e Author

    BookWithAuthor(String t, Author a) {
        title = t;
        author = a;
    }

    void displayDetails() {
        System.out.println("Book: " + title + ", Author: " + author.name);
    }
}

public class ObjectAssociation {

    public static void main(String[] args) {
        Author author = new Author("George Orwell");
        BookWithAuthor book = new BookWithAuthor("1984", author);
        book.displayDetails();
    }
}
