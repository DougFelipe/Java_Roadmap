
/*
Métodos da Classe:
Métodos são funções associadas a uma classe. Eles representam as ações ou comportamentos 
que os objetos da classe podem executar.

Explicação:
No exemplo abaixo, a classe 'Calculator' possui um método chamado 'add' que aceita dois 
parâmetros e retorna sua soma.
*/

public class ClassMethods {
    
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ClassMethods calculator = new ClassMethods();
        int result = calculator.add(5, 3);
        System.out.println("Result of addition: " + result);
    }
}
