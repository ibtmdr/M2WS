package fr.m2i.m2ws.todoList;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ws.rs.*;

import java.util.ArrayList;
import java.util.LinkedList;

@Path("/todoList")
public class todoResource {


    public static LinkedList<Todo> todolist = new LinkedList<Todo>();


    @GET
    @Path("/select")
    @Produces("application/json")
    public LinkedList<Todo> select() {
        return todolist;
    }
    @POST
    @Path("/add")
    @Consumes("application/json")
    public String insert(Todo p) {
        todolist.add(p);
        return  " todo : "+ p.getTitre() + " " + p.getDescription() + " added";
    }
    @DELETE
    @Path("/delete/{id}")
    @Produces("application/json")
    public String delete(@PathParam("id") int id) {
        todolist.remove(id);
        return  " todo deleted";
    }
    @PUT
    @Path("/update/{id}")
    @Consumes("application/json")
    public String update(@PathParam("id") int id,Todo p) {
        todolist.set(id,p);
        return " Todo "+ p.getTitre() + " " + p.getDescription();
    }
}

