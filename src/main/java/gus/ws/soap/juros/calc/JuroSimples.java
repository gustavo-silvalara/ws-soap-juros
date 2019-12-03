package gus.ws.soap.juros.calc;

/**
 *
 * @author gustavo
 */
public class JuroSimples {

    public static float calcularJuro(float capital, float taxa, int periodo) {
        return capital * (taxa / 100) * periodo;
    }

    public static float calcularMontante(float capital, float taxa, int periodo) {
        return capital + calcularJuro(capital, taxa, periodo);
    }

}
