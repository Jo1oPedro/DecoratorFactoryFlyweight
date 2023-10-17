import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonagemTest {

    @Test
    public void deveRetornarPersonagemSemArmadura() {
        IConteudoJogo personagem = new Personagem();
        assertEquals("personagem", personagem.getNomeSet());
    }

    @Test
    public void deveRetornarPersonagemComCapacete() {
        IConteudoJogo capacete = new Capacete(new Personagem());
        assertEquals("personagem / capacete", capacete.getNomePeca());
    }

    @Test
    public void deveRetornarPersonagemComPeitoral() {
        IConteudoJogo peitoral = new Peitoral(new Personagem());
        assertEquals("personagem / peitoral", peitoral.getNomePeca());
    }

    @Test
    public void deveRetornarPersonagemComLuva() {
        IConteudoJogo luva = new Luva(new Personagem());
        assertEquals("personagem / luva", luva.getNomePeca());
    }

    @Test
    public void deveRetornarPersonagemComCapaceteMaisPeitoral() {
        IConteudoJogo capacete = new Peitoral(new Capacete(new Personagem()));
        assertEquals("personagem / capacete / peitoral", capacete.getNomePeca());
    }

    @Test
    public void deveRetornarPersonagemComCapaceteMaisPeitoralMaisLuva() {
        IConteudoJogo capacete = new Luva(new Peitoral(new Capacete(new Personagem())));
        assertEquals("personagem / capacete / peitoral / luva", capacete.getNomePeca());
    }
}
