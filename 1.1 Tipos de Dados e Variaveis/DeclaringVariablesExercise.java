
/*
Declarando Variáveis

Em Java, uma variável é um nome dado a uma área de memória para armazenar valores. A sintaxe para declarar 
uma variável é: tipo nomeDaVariavel;

Neste exemplo, declaramos diferentes tipos de variáveis e imprimimos seus valores.
*/
public class DeclaringVariablesExercise {
    public static void main(String[] args) {
        int age;
        double salary;
        char gender;
        boolean isEmployed;
        
        age = 30;
        salary = 50000.5;
        gender = 'M';
        isEmployed = true;
        
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Is employed: " + isEmployed);
    }
}
