/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.security.ntlm.Client;
//import com.sun.security.ntlm.Client;
import dto.userDto;
import java.awt.PageAttributes.MediaType;
import static java.util.Collections.list;
import java.util.List;
import javax.xml.ws.Response;
import javax.xml.ws.ClientBuilder;
import javax.xml.ws.WebTarget;
import org.eclipse.jdt.internal.compiler.ast.Invocation;

/**
 *
 * @author geral
 */
public class userCliente {

    public List<userDto> listUser() {

        Response response = null;
        WebTarget webTarget;
        Client client = ClientBuilder.newClient();
        List<userDto> list = null;
        String responseJson = null;
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            webTarget = client.target("https://632b5d371090510116d79c04.mockapi.io/api/v1/:endpoint");
            Invocation.Builder invocationBuilder = WebTarget.request(MediaType.APPLICATION_JSON);
            response = invocationBuilder.get();

            System.out.prinln("Status " + response.getStatus());
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed: HTTPS error code:" + response.getStatus());

            }

            responseJson = response.readEntity(String.class);
            list = objectMapper.readValue(responseJson, new TypeReference<List<userDto>>(){});

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
        return list;
    }

}
