import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArmaduraFactory {

    private static Map<ArmaduraNome, IConteudoJogo> armaduras = new HashMap<>();

    public static IConteudoJogo adicionaArmadura(String armadura, String nome, IConteudoJogo personagem) throws ClassNotFoundException {
        ArmaduraNome armaduraNome = new ArmaduraNome(armadura, nome);
        IConteudoJogo armaduraComponente = ArmaduraFactory.armaduras.get(armaduraNome);
        if(armaduraComponente == null) {
            Class<?> classe = null;
            Object objeto = null;

            try {
                classe = Class.forName(armadura);
                Constructor<?> constructor = classe.getConstructor(IConteudoJogo.class);
                objeto = constructor.newInstance(personagem);
                Method setNomeMethod = classe.getMethod("setNomeArmadura", String.class);
                setNomeMethod.invoke(objeto, nome);
                ArmaduraFactory.armaduras.put(armaduraNome, (IConteudoJogo) objeto);
                return (IConteudoJogo) objeto;
            } catch (Exception exception) {
                throw new IllegalArgumentException("Armadura invalida");
            }
        } else {
            return armaduraComponente;
        }
    }

    public static int getTotalArmadura() {
        return ArmaduraFactory.armaduras.size();
    }
}
