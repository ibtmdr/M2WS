package fr.m2i.m2ws.calculatrice;

        import jakarta.ws.rs.GET;
        import jakarta.ws.rs.Path;
        import jakarta.ws.rs.PathParam;
        import jakarta.ws.rs.Produces;

@Path("/cal")
public class Calculatrice {


    @GET
    @Path("/multi/{a}/{b}")
    @Produces("application/json")
    public Integer multi(@PathParam("a") int a, @PathParam("b") int b) {
        return calcule.multiplication(a,b);
    }
    @GET
    @Path("/sous/{a}/{b}")
    @Produces("application/json")
    public Integer sous(@PathParam("a") int a, @PathParam("b") int b) {
        return calcule.soustraction(a,b);

    }
    @GET
    @Path("/add/{a}/{b}")
    @Produces("application/json")
    public Integer add(@PathParam("a") int a, @PathParam("b") int b) {
        return  calcule.addition(a,b);
    }

    @GET
    @Path("/facto/{a}")
    @Produces("application/json")
    public Integer add(@PathParam("a") int a) {
        return calcule.factorielle(a);
    }

}