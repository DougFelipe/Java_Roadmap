
/*
Uso de Getters e Setters:
Getters e Setters são usados para acessar e atualizar os atributos de uma classe, 
respectivamente, especialmente quando esses atributos são privados.

Explicação:
No exemplo abaixo, temos a classe 'Person' com atributos privados 'name' e 'age'. 
Usamos getters e setters para acessar e modificar esses atributos.
*/

class GettersSettersExample {
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
        if (newAge >= 0) {  // Validating age to ensure it's non-negative
            age = newAge;
        }
    }

    public static void main(String[] args) {
        GettersSettersExample person = new GettersSettersExample();
        person.setName("Alice");
        person.setAge(25);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}

