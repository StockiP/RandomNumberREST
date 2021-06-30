package at.stockerer;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Random;

@Path("api")
public class RandomController {
    public int randomNumber(){
        Random rand = new Random();
        int upper = 100;
        return rand.nextInt(upper);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getRandom() {
        Response.ResponseBuilder rb = Response.ok(randomNumber());
        return rb.header("Access-Control-Allow-Origin", "*").build();
    }

}
