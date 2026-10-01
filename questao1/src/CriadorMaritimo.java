public class CriadorMaritimo extends CriadorFrete {
    @Override
    public Frete criarFrete() {
        return new FreteMaritimo();
    }
}