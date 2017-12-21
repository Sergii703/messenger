package org.rest.api.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.rest.api.messenger.database.DatabaseClass;
import org.rest.api.messenger.model.Model;

public class ModelService {

	private Map<Long, Model> models = DatabaseClass.getModels();
	
	public List<Model> getAllModels(){
		return new ArrayList<Model>(models.values());
	}
	
	public Model getModel(long id) {
		return models.get(id);
	}
	
	public Model addModel(Model message) {
		message.setId(models.size()+1);
		models.put(message.getId(), message);
		return message;
	}
	
	public Model udatemodel(Model message) {
		if(message.getId()<=0) {
			return null;
		}
		models.put(message.getId(), message);
		return message;
	}
	
	public Model removeModel(long id) {
		return models.remove(id);
	}
}






