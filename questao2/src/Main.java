public class Main {
    public static void main(String[] args) {
        Resumo brasil = new Resumo(new FabricaBrasil());
        Resumo mexico = new Resumo(new FabricaMexico());

        brasil.finalizar(500);
        mexico.finalizar(500);
    }   
}