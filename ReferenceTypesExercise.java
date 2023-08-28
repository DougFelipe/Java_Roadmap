
/*
Tipos de Referência

Os tipos de referência são usados para se referir a objetos. Os principais tipos de referência são classes, 
interfaces e arrays.

Neste exemplo, criamos uma classe simples e instanciamos um objeto dessa classe.
*/
public class ReferenceTypesExercise {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 30;
        
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}

class Person {
    String name;
    int age;
}
