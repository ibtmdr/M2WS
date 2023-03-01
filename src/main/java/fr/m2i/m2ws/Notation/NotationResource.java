package fr.m2i.m2ws.Notation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ws.rs.*;

import java.util.ArrayList;

@Path("/Notation")
public class NotationResource {




    @GET
    @Path("/select")
    @Produces("application/json")
    public ArrayList<Notation> select() {
        ArrayList a = CRUDNotation.selectNotation();
        return a;
    }
    @POST
    @Path("/add")
    @Consumes("application/json")
    public String insert(Notation p) {
        int id = CRUDNotation.insertionNotation(p);
        return  " note id" + id + " etudiant "+ p.getNom() + " " + p.getPrenom();
    }
    @DELETE
    @Path("/delete/{id}")
    @Produces("application/json")
    public String delete(@PathParam("id") int id) {
        CRUDNotation.deleteNotation(id);
        return  " etudiant note with id " + id +" deleted";
    }
    @PUT
    @Path("/update")
    @Consumes("application/json")
    public String update(Notation p) {
        CRUDNotation.updateNotation(p);
        return " etudiant "+ p.getNom() + " " + p.getPrenom();
    }
}

