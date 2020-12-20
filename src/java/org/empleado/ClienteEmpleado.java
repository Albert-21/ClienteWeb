/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.empleado;

import java.util.List;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import org.pojos.Empleado;

/**
 * Jersey REST client generated for REST resource:EmpleadosResource
 * [empleados]<br>
 * USAGE:
 * <pre>
 *        ClienteEmpleado client = new ClienteEmpleado();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author alberto
 */
public class ClienteEmpleado {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8084/EjemploRest2/webresources";
    private GenericType<List<Empleado>> genericType = new GenericType<List<Empleado>>(){};

    public ClienteEmpleado() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("empleados");
    }

    public <T> T borrar(Class<T> responseType, String id) throws ClientErrorException {
        return webTarget.path(java.text.MessageFormat.format("{0}", new Object[]{id})).request().delete(responseType);
    }

    public <T> T mostrarById(Class<T> responseType, String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T guardar(Object requestEntity, Class<T> responseType) throws ClientErrorException {
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON), responseType);
    }

    public <T> T actualizar(Object requestEntity, Class<T> responseType) throws ClientErrorException {
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON), responseType);
    }

    public <T> List<Empleado> mostrarTodos(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(genericType);
    }

    public void close() {
        client.close();
    }
    
}
