package controllers;

import org.codehaus.jackson.JsonNode;

import play.*;
import play.mvc.*;
import play.mvc.Http.RequestBody;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
	  return ok("version 1.0");
	    }
  public static Result notification() {
	  RequestBody body = request().body();
	  JsonNode data=body.asJson();

    return ok("les params sont : "+data.get("params").toString()+"l evenement est: "+data.get("event").toString());


  }
  
}