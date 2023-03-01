package fr.m2i.m2ws;

import fr.m2i.m2ws.calculatrice.calcule;
import fr.m2i.m2ws.module.Personne;
import jakarta.ws.rs.*;

@Path("/Personne")
public class HelloResource2 {


    @GET
    @Path("/select")
    @Produces("application/json")
    public Personne select() {
        Personne p = new Personne();
        p.setAge(12);
        p.setNom("Mdarbi");
        p.setPrenom("ibtissam");
        return p;
    }
    @POST
    @Path("/add")
    @Consumes("application/json")
    public String insert(Personne p) {
        return "personne "+ p.getNom() + " " + p.getPrenom();
    }
    @DELETE
    @Path("/delete/{id}")
    @Produces("application/json")
    public String delete(@PathParam("id") int id) {
        return  "personne deleted";
    }
    @PUT
    @Path("/update")
    @Consumes("application/json")
    public String update(Personne p) {
        return "personne "+ p.getNom() + " " + p.getPrenom();
    }
}

