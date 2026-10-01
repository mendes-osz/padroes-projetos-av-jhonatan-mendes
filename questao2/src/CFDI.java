public class CFDI implements IComprovanteFiscal {
    public String descrever(double valor) {
        return "CFDI com IVA de 16%: R$ " + (valor * 0.16);
    }
}