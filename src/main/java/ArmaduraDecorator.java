public abstract class ArmaduraDecorator implements IConteudoJogo {

    IConteudoJogo conteudoJogo = null;
    String nome = "";

    public ArmaduraDecorator(IConteudoJogo conteudoJogo) {
        this.conteudoJogo = conteudoJogo;
    }
    @Override
    public Float getPontuacaoArmadura() {
        return this.conteudoJogo.getPontuacaoArmadura() + this.getPontuacaoArmaduraComponente();
    }

    protected abstract Float getPontuacaoArmaduraComponente();
    @Override
    public String getNomeSet() {
        return this.conteudoJogo.getNomeSet() + " / " + this.getNomeArmadura();
    }

    protected abstract IConteudoJogo setNomeArmadura(String nome);

    protected abstract String getNomeArmadura();

    public String getNomePeca() {
        return this.conteudoJogo.getNomePeca() + " / " + this.getNomePecaComponente();
    }

    public abstract String getNomePecaComponente();

}
