public class Main {
    public static void main(String[] args) {
        // Sempre devemos pensar se o SET vale a pena no nosso projeto, as vezes dependendo da regra NÃO
        Pet pet01 = new Pet();
        pet01.setNome("Salieri");
        pet01.setQtdIdasAoPetShop(0);
        pet01.setTotalGasto(0.0);

        Pet pet02 = new Pet("Amadeus", 0, 0.0);

        PetShop petShop1 = new PetShop("ShopPet", 0.0);

        System.out.println("""
                Nome pet: %s
                Total gasto: %s
                Quantidade idas: %d""".formatted(pet01.getNome(), pet01.getTotalGasto(),
                pet01.getQtdIdasAoPetShop()));

        petShop1.darBanho(pet01);

        System.out.println("""
                Nome pet: %s
                Total gasto: %s
                Quantidade idas: %d""".formatted(pet01.getNome(), pet01.getTotalGasto(),
                pet01.getQtdIdasAoPetShop()));
    }
}
