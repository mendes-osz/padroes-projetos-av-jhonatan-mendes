public abstract class Frete {
    String modalidade;
    String cliente;
    double valor;

    public abstract double calcularValorFrete();
    public abstract String documentos();
}