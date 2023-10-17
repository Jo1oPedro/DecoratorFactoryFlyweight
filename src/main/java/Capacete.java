public class Capacete extends ArmaduraDecorator {

    public Capacete(IConteudoJogo conteudoJogo) {
        super(conteudoJogo);
    }

    @Override
    protected Float getPontuacaoArmaduraComponente() {
        return 10f;
    }

    @Override
    public IConteudoJogo setNomeArmadura(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    protected String getNomeArmadura() {
        return this.nome;
    }

    @Override
    public String getNomePecaComponente() {
        return "capacete";
    }
}
