
/*
Encapsulamento e Agregação:
A agregação é uma forma de associação em que uma classe contém referências a objetos de outras classes. 
O encapsulamento garante que os detalhes internos da classe contida não sejam expostos desnecessariamente.

Explicação:
No exemplo abaixo, temos duas classes 'Author' e 'Book'. A classe 'Book' possui uma referência 
a um objeto 'Author', demonstrando agregação. O encapsulamento garante que os atributos de ambas 
as classes sejam privados e acessados apenas através de métodos públicos.
*/

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        Author author = new Author("George Orwell");
        Book book = new Book("1984", author);
        
        System.out.println("Book: " + book.getTitle() + ", Author: " + book.getAuthor().getName());
    }
}

