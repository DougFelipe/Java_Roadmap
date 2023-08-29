
/*
Métodos Estáticos e Atributos Estáticos:
Métodos e atributos estáticos pertencem à classe, em vez de qualquer objeto específico.

Explicação:
No exemplo abaixo, a classe 'MathUtility' tem um método estático 'square' e um 
atributo estático 'PI'. Estes membros estáticos podem ser acessados diretamente 
através do nome da classe, sem a necessidade de criar uma instância da classe.
*/

public class StaticMembers {
    static final double PI = 3.141592653589793;

    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int result = StaticMembers.square(5);
        System.out.println("Square of 5: " + result);
        System.out.println("Value of PI: " + StaticMembers.PI);
    }
}
