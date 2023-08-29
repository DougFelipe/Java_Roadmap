
/*
Modificadores de Acesso:
Eles determinam a visibilidade dos membros de uma classe (atributos e métodos). 
Os mais comuns são 'private', 'public', e 'protected'.

Explicação:
No exemplo abaixo, a classe 'Person' tem um atributo 'name' que é privado. 
Para acessar e modificar esse atributo, usamos métodos públicos (getters e setters).
*/

public class AccessModifiers {
    private String name;

    // Getter para 'name'
    public String getName() {
        return name;
    }

    // Setter para 'name'
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        AccessModifiers person = new AccessModifiers();
        person.setName("John");
        System.out.println("Person's name: " + person.getName());
    }
}
