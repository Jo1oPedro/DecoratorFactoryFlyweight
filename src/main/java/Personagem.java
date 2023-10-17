public class Personagem implements IConteudoJogo {

    @Override
    public Float getPontuacaoArmadura() {
        return 1f;
    }

    @Override
    public String getNomeSet() {
        return "personagem";
    }

    public String getNomePeca() {
        return "personagem";
    }

}
