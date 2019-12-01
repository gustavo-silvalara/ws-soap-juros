package ws.juros.calc;

/**
 *
 * @author gustavo
 */
public class JuroComposto {

    public static float calcularJuro(float capital, float taxa, int periodo) {
        return calcularMontante(capital, taxa, periodo) - capital;
    }

    public static float calcularMontante(float capital, float taxa, int periodo) {
        float montante = capital;
        for (int i = 0; i < periodo; i++) {
            montante = juro(montante, taxa);
        }
        return montante;
    }

    public static float juro(float capital, float taxa) {
        return capital * (1 + (taxa / 100));
    }
}
