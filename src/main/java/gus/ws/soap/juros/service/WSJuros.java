/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gus.ws.soap.juros.service;

import gus.ws.soap.juros.calc.JuroComposto;
import gus.ws.soap.juros.calc.JuroSimples;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author gustavo
 */
@WebService(serviceName = "WSJuros")
public class WSJuros {

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
