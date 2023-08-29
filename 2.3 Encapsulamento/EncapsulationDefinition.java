
/*
Definição de Encapsulamento:
O Encapsulamento é um dos quatro pilares fundamentais da OOP (Programação Orientada a Objetos).
Refere-se ao agrupamento de dados (atributos) e os métodos que operam esses dados em uma única unidade ou classe.

Explicação:
No exemplo abaixo, temos a classe 'Person' que encapsula os atributos 'name' e 'age' e os métodos 
'getName', 'setName', 'getAge' e 'setAge'. Esses métodos são usados para acessar e modificar os atributos.
*/

class EncapsulationDefinition {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public static void main(String[] args) {
        EncapsulationDefinition person = new EncapsulationDefinition();
        person.setName("John");
        person.setAge(30);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}

