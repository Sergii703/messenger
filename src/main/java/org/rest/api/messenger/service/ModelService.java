package org.rest.api.messenger.service;

import java.util.ArrayList;
import java.util.List;
import org.rest.api.messenger.model.Model;

public class ModelService {

	public List<Model> getAllModels(){
		Model m1 = new Model(1L, "Hi", "Tim");
		Model m2 = new Model(2L, "Hi again", "Stev");
		List<Model> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}
}
