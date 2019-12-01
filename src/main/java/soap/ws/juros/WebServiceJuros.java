package soap.ws.juros;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import ws.juros.calc.JuroComposto;
import ws.juros.calc.JuroSimples;

/**
 *
 * @author gustavo
 */
@WebService(serviceName = "WebServiceJuros")
public class WebServiceJuros {

    @WebMethod(operationName = "juroSimples")
    public float juroSimples(@WebParam(name = "capital") float capital,
            @WebParam(name = "taxa") float taxa, @WebParam(name = "periodo") int periodo) {
        return JuroSimples.calcularJuro(capital, taxa, periodo);
    }

    @WebMethod(operationName = "montanteJuroSimples")
    public float montanteJuroSimples(@WebParam(name = "capital") float capital,
            @WebParam(name = "taxa") float taxa, @WebParam(name = "periodo") int periodo) {
        return JuroSimples.calcularMontante(capital, taxa, periodo);
    }

    @WebMethod(operationName = "juroComposto")
    public float juroComposto(@WebParam(name = "capital") float capital,
            @WebParam(name = "taxa") float taxa, @WebParam(name = "periodo") int periodo) {
        return JuroComposto.calcularJuro(capital, taxa, periodo);
    }

    @WebMethod(operationName = "montanteJuroComposto")
    public float montanteJuroComposto(@WebParam(name = "capital") float capital,
            @WebParam(name = "taxa") float taxa, @WebParam(name = "periodo") int periodo) {
        return JuroComposto.calcularMontante(capital, taxa, periodo);
    }
}
