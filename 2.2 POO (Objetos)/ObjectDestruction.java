
/*
Destruição de Objetos:
Em Java, a coleta de lixo é automática. O coletor de lixo destroi objetos que não 
são mais referenciados.

Explicação:
No exemplo abaixo, temos uma classe 'DestructibleObject' com um método 'finalize'. 
Este método é chamado antes de o objeto ser coletado pelo coletor de lixo.
*/

public class ObjectDestruction {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being collected by Garbage Collector");
    }

    public static void main(String[] args) {
        ObjectDestruction obj1 = new ObjectDestruction();
        ObjectDestruction obj2 = new ObjectDestruction();

        // Destruindo os objetos
        obj1 = null;
        obj2 = null;

        // Solicitando a execução do coletor de lixo
        System.gc();
    }
}
