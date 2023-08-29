
/*
Modificador private:
O modificador private é usado para restringir o acesso. Membros declarados como private 
não são acessíveis fora da classe em que estão presentes.

Explicação:
No exemplo abaixo, temos a classe 'PrivateModifierExample' com um atributo 'privateData'. 
Este atributo não pode ser acessado diretamente fora da classe. Portanto, usamos métodos públicos 
(getter e setter) para acessar e modificar esse atributo.
*/

class PrivateModifierExample {
    private String privateData;

    public String getPrivateData() {
        return privateData;
    }

    public void setPrivateData(String data) {
        privateData = data;
    }

    public static void main(String[] args) {
        PrivateModifierExample example = new PrivateModifierExample();
        example.setPrivateData("This is private data.");
        System.out.println("Private Data: " + example.getPrivateData());
    }
}

