public class FabricaBrasil implements IFabricaPais {
    public IComprovanteFiscal criarComprovante() {
        return new NFSe();
    }

    public IPagamento criarPagamento() {
        return new Pix();
    }
}