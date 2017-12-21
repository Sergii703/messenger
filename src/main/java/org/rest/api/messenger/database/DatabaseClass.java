package org.rest.api.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.rest.api.messenger.model.Model;
import org.rest.api.messenger.model.Profile;

public class DatabaseClass {
	private static Map<Long, Model> models = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Model> getModels(){
		return models;
	}
	
	public static Map<Long, Profile> getProfiles(){
		return profiles;
	}
}
