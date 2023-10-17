import Exceptions.PersonagemIncompletoException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonagemBuilder {

    protected IConteudoJogo personagem = null;
    public PersonagemBuilder() {
        this.personagem = new Personagem();
    }

    public IConteudoJogo build() throws PersonagemIncompletoException {
        String regex = "(?=.*\\bpeitoral\\b)(?=.*\\bcapacete\\b)(?=.*\\bluva\\b)";

        Pattern pattern = Pattern.compile(regex);
        System.out.println(this.personagem.getNomePeca());
        Matcher matcher = pattern.matcher(this.personagem.getNomePeca());

        if(matcher.find()) {
            return this.personagem;
        }

        throw new PersonagemIncompletoException();
    }

    public PersonagemBuilder adicionaArmadura(String armadura, String nome) throws ClassNotFoundException {
        this.personagem = ArmaduraFactory.adicionaArmadura(armadura, nome, this.personagem);
        return this;
    }
}
