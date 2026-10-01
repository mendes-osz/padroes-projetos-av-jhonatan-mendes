public class FreteMaritimo extends Frete {
    public double calcularValorFrete() {
        return valor * 0.01;
    }

    public String documentos() {
        return "BL e Fatura comercial";
    }
}