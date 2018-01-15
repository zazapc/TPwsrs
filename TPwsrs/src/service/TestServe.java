package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/banque")
public class TestServe {
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
   public String test(){
	return "Test";
   }
	@GET
	@Path("/conversion/{montant}")
	@Produces(MediaType.APPLICATION_JSON)
   public double conversion(@PathParam("montant")double mt){
	   return mt*11;
   }
	@GET
	@Path("/conversion/infos")
	@Produces(MediaType.APPLICATION_JSON)
   public List<String> getInfos(){
	   List<String> liste=new ArrayList<>();
	   liste.add("A");
	   liste.add("B");
	   liste.add("C");
	   return liste;	   
   }
}
