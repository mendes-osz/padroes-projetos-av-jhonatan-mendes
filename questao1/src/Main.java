public class Main {
    public static void main(String[] args) {
        CriadorFrete rodoviario = new CriadorRodoviario();
        CriadorFrete aereo = new CriadorAereo();
        CriadorFrete maritimo = new CriadorMaritimo();

        rodoviario.imprimirResumo("Rodoviária", "João", 500);
        aereo.imprimirResumo("Aérea", "Maria", 400);
        maritimo.imprimirResumo("Marítima", "Pedro", 300);
    }
}