
/*
Uso de `super` com Polimorfismo:
A palavra-chave `super` é usada para se referir à superclasse imediata de uma classe.

Explicação:
Neste exemplo, temos uma superclasse 'Person' e uma subclasse 'Student'. A subclasse 'Student' tem um construtor que 
chama o construtor da superclasse usando a palavra-chave `super`.
*/

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);  // Calling the superclass constructor
        this.rollNo = rollNo;
    }

    @Override
    void display() {
        super.display();  // Calling the superclass method
        System.out.println("Roll No: " + rollNo);
    }
}

public class SuperUsage {
    public static void main(String[] args) {
        Student student = new Student("John", 101);
        student.display();
    }
}

