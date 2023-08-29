
/*
Atributos da Classe:
Atributos são variáveis associadas a uma classe. Eles representam o estado ou as características 
de um objeto daquela classe.

Explicação:
No exemplo abaixo, a classe 'Student' tem três atributos: 'name', 'age' e 'grade'.
*/

public class ClassAttributes {
    String name;
    int age;
    double grade;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        ClassAttributes student1 = new ClassAttributes();
        student1.name = "Alice";
        student1.age = 20;
        student1.grade = 8.5;
        student1.displayInfo();
    }
}
