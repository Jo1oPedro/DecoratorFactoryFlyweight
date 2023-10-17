public class Luva extends ArmaduraDecorator {

    public Luva(IConteudoJogo conteudoJogo) {
        super(conteudoJogo);
    }

    @Override
    protected Float getPontuacaoArmaduraComponente() {
        return 5f;
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
        return "luva";
    }
}
