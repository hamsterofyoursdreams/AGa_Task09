package org.AGa.rs;

import org.AGa.beans.Counter;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/counter")
public class CounterRs {

    @Inject
    Counter counter1; // Внедрение первого экземпляра

    @Inject
    Counter counter2; // Внедрение второго экземпляра

    @GET
    @Path("/test")
    public int get() {
        return counter1.get();
    }

    @GET
    @Path("/compare")
    public String compare() {
        int c1 = counter1.get();
        int c2 = counter2.get();
        return "Counter1: " + c1 + ", Counter2: " + c2;
    }
}