
/*
Encapsulamento e Construtores:
Os construtores também podem ser usados para definir valores iniciais para atributos encapsulados.

Explicação:
No exemplo abaixo, temos a classe 'Book' que encapsula os atributos 'title' e 'author'. 
O construtor é usado para inicializar esses atributos quando um objeto é criado.
*/

class EncapsulationConstructorsExample {
    private String title;
    private String author;

    public EncapsulationConstructorsExample(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        EncapsulationConstructorsExample book = new EncapsulationConstructorsExample("The Great Gatsby", "F. Scott Fitzgerald");
        System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
    }
}

