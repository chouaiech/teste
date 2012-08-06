package controllers;

import org.codehaus.jackson.JsonNode;

import play.*;
import play.mvc.*;
import play.mvc.Http.RequestBody;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
	  RequestBody body = request().body();
	  JsonNode data=body.asJson();
	  String params=data.get("params").asText();
	  String event=data.get("event").asText();

    return ok("les params sont : "+params+"l evenement est: "+event);
  }
  
}