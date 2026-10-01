public class CriadorRodoviario extends CriadorFrete {
    @Override
    public Frete criarFrete() {
        return new FreteRodoviario();
    }
}