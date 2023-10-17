public class Peitoral extends ArmaduraDecorator {
    public Peitoral(IConteudoJogo conteudoJogo) {
        super(conteudoJogo);
    }

    @Override
    protected Float getPontuacaoArmaduraComponente() {
        return 15f;
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
        return "peitoral";
    }
}
