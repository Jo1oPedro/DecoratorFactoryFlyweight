package Exceptions;

public class PersonagemIncompletoException extends Exception{
    public PersonagemIncompletoException() {
        super("O personagem está incompleto");
    }

    public PersonagemIncompletoException(String mensagem) {
        super(mensagem);
    }
}
