public class FabricaMexico implements IFabricaPais {
    public IComprovanteFiscal criarComprovante() {
        return new CFDI();
    }

    public IPagamento criarPagamento() {
        return new SPEI();
    }   
}