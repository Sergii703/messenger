package org.rest.api.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rest.api.messenger.model.Model;
import org.rest.api.messenger.service.ModelService;

@Path("/messages")
public class Message {
	
	ModelService modelService = new ModelService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Model> getMessages() {
		return modelService.getAllModels();
	}	
}
