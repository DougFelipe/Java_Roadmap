
/*
Objetos Anônimos:
São objetos que são instanciados mas não são atribuídos a nenhuma referência.

Explicação:
No exemplo abaixo, temos uma classe 'Greeting'. Criamos um objeto anônimo da classe 
'Greeting' e chamamos o método 'sayHello' diretamente. Esse objeto é usado apenas uma vez.
*/

public class AnonymousObjects {

    public void sayHello() {
        System.out.println("Hello from Anonymous Object!");
    }

    public static void main(String[] args) {
        new AnonymousObjects().sayHello();  // Criando e usando objeto anônimo
    }
}
