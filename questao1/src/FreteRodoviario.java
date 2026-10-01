public class FreteRodoviario extends Frete {
    public double calcularValorFrete() {
        return valor * 0.02;
    }

    public String documentos() {
        return "CT-e e MDF-e";
    }
}