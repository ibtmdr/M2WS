package fr.m2i.m2ws.calcule;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/calcule")
public class HelloResource {


    @GET
    @Path("/multi")
    @Produces("application/json")
    public Integer multi() {
        return 4*2;
    }
    @GET
    @Path("/sous")
    @Produces("application/json")
    public Integer sous() {
        return 3-1;

    }
    @GET
    @Path("/add")
    @Produces("application/json")
    public Integer add() {
        return 1+1;
    }
}