package org.eclipse.resource;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
@Path("ConversionService")
public class conversion {
 
     @GET
     @Path("/DinarToEuro/{i}")
     @Produces(MediaType.TEXT_XML)
      public String convertDinarToEuro(@PathParam("i") double i) {
 
        double euro =  i*0.31;
 
        return "<DinarToEuroService>"
        + "<Dinar>" + i + "</Dinar>"
          + "<Euro>" + euro + "</Euro>"
         + "</DinarToEuroService>";
      }
 
      @Path("/EuroToDinar/{f}")
      @GET
      public String convertEuroToDinar(@PathParam("f") double f) {
          double dinar = f*3.28;
 
          return  ""+dinar ;
      }
 
}
