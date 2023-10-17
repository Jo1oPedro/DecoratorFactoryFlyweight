import java.util.Objects;

public class ArmaduraNome {
    private String tipo;
    private String nome;

    public ArmaduraNome(String chave, String subchave) {
        this.tipo = chave;
        this.nome = subchave;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArmaduraNome that = (ArmaduraNome) o;
        return tipo.equals(that.tipo) && nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, nome);
    }
}
