
/*
Benefícios da Imutabilidade:
Objetos imutáveis são aqueles cujo estado não pode ser alterado após serem criados. 
Isso traz benefícios em termos de segurança e simplificação.

Explicação:
No exemplo abaixo, temos uma classe 'ImmutableClass' que representa um objeto imutável. 
Uma vez que um objeto desta classe é criado, seu estado (data) não pode ser modificado.
*/

final class ImmutableClass {
    private final String data;

    public ImmutableClass(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    // No setters provided, making it immutable

    public static void main(String[] args) {
        ImmutableClass immutableObject = new ImmutableClass("Immutable Data");
        System.out.println("Data: " + immutableObject.getData());
    }
}

