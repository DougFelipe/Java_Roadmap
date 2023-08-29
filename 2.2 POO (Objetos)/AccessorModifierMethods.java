
/*
Métodos Acessores e Modificadores:
Métodos para obter e definir o valor de atributos privados são chamados de getters e setters, respectivamente.

Explicação:
No exemplo abaixo, a classe 'Employee' tem um atributo privado 'id'. Usamos o método 
getter 'getId' para obter o valor de 'id' e o método setter 'setId' para definir seu valor.
*/

public class AccessorModifierMethods {
    private int id;

    // Getter para 'id'
    public int getId() {
        return id;
    }

    // Setter para 'id'
    public void setId(int newId) {
        this.id = newId;
    }

    public static void main(String[] args) {
        AccessorModifierMethods employee = new AccessorModifierMethods();
        employee.setId(101);
        System.out.println("Employee ID: " + employee.getId());
    }
}
