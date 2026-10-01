public class Resumo {
    IFabricaPais fabrica;

    public Resumo(IFabricaPais fabrica) {
        this.fabrica = fabrica;
    }

    public void finalizar(double valor) {
        IComprovanteFiscal documento = fabrica.criarComprovante();
        IPagamento pagamento = fabrica.criarPagamento();

        System.out.println(documento.descrever(valor));
        System.out.println(pagamento.descrever());
        System.out.println();
    }
}