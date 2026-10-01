public abstract class CriadorFrete {
    public abstract Frete criarFrete();

    public void imprimirResumo(String modalidade, String cliente, double valor) {
        Frete frete = criarFrete();
        frete.modalidade = modalidade;
        frete.cliente = cliente;
        frete.valor = valor;

        System.out.println("Modalidade: " + frete.modalidade);
        System.out.println("Nome do cliente: " + frete.cliente);
        System.out.println("Valor do frete: R$ " + frete.calcularValorFrete());
        System.out.println("Documentos: " + frete.documentos());
        System.out.println();
    }
}