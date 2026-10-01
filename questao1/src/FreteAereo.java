public class FreteAereo extends Frete {
    public double calcularValorFrete() {
        return valor * 0.06;
    }

    public String documentos() {
        return "AWB";
    }
}