public class Whatsapp {
    public static void main(String[] args) {
        Contato contato01 = new Contato("Carlos", "(34) 123");
        Contato contato02 = new Contato("Daniel", "(23) 111");
        Contato contato03 = new Contato("Cristiano", "(11) 777");

        Grupo grupo01 = new Grupo("Trabalho");
        Grupo grupo02 = new Grupo("Amigos");

        grupo01.adiciona(contato01);
        grupo01.adiciona(contato02);

        grupo02.adiciona(contato03);

        System.out.println(grupo01);
        System.out.println(grupo02);
    }
}
