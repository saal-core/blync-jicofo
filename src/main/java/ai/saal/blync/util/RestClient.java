package ai.saal.blync.util;

import ai.saal.blync.dto.ValidationRes;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient {

    public static ValidationRes invokeHostValidation(String url, Object payload){

        Client client = ClientBuilder.newClient();
        return client
                .target(url)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(payload, MediaType.APPLICATION_JSON), ValidationRes.class);
    }

    public static Response updateConferenceState(String url, Object payload){
        System.out.println(url);
        Client client = ClientBuilder.newClient();
        return client.target(url)
                .request(MediaType.APPLICATION_JSON)
                .put(Entity.entity(payload, MediaType.APPLICATION_JSON));
    }
}
