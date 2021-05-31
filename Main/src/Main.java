public class Main {

    public static void main(String[] args) {
        Persona p = new Persona("Laura","Rossi", 16);
        System.out.println("Nome: "+p.getNome()+
                "\nCongome: "+p.getCognome()+
                "\nEta: "+p.getEta());
    }
}
