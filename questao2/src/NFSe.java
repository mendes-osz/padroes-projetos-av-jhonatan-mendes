public class NFSe implements IComprovanteFiscal {
    public String descrever(double valor) {
        return "NFS-e com ISS de 5%: R$ " + (valor * 0.05);
    }
}