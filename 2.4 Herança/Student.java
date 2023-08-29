
/*
Uso de `super`:
O `super` é uma palavra-chave em Java que se refere ao objeto da superclasse imediata. É usado para chamar 
o construtor da superclasse e para acessar métodos e atributos da superclasse.

Explicação:
Neste exemplo, a superclasse 'Person' possui um construtor que aceita um nome. A subclasse 'Student' 
usa a palavra-chave `super` para chamar o construtor da superclasse e inicializar o atributo 'name'.
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
        super(name);  // Call superclass constructor
        this.rollNo = rollNo;
    }
    
    void displayDetails() {
        display();  // Call superclass method
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student student = new Student("John", 101);
        student.displayDetails();
    }
}

