/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sergio
 */
@WebService(serviceName = "FactorialWebService")
public class FactorialWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "factorial")
    public int factorial(@WebParam(name = "factorial") int number) {
        int factorial = 1;

        while (number != 0) {
            factorial = factorial * number;
            number--;
        }
        return factorial;
    }
}
