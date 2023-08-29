
/*
Definição de Objeto:
Um objeto é uma instância de uma classe. Ele representa uma entidade no mundo real 
que pode ter um estado (atributos) e comportamento (métodos).

Explicação:
No exemplo abaixo, temos uma classe 'Student'. O objeto 'student1' é uma instância 
dessa classe. Ele tem atributos como 'name' e 'age' e um comportamento representado 
pelo método 'displayInfo'.
*/

public class ObjectDefinition {
    String name;
    int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ObjectDefinition student1 = new ObjectDefinition();
        student1.name = "Alice";
        student1.age = 20;
        student1.displayInfo();
    }
}
