package org.rest.api.messenger.model;


import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {

		private long id;
		private String profileName;
		private String name;
		private String surname;
		private Date created;
		
		public Profile() {
			
		}
		
		public Profile(long id, String profileName, String name, String surname) {
			this.id = id;
			this.profileName = profileName;
			this.name = name;
			this.surname = surname;
		}
		
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getProfileName() {
			return profileName;
		}
		public void setProfileName(String profileName) {
			this.profileName = profileName;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;;
		}
		public Date getCreated() {
			return created;
		}
		public void setCreated(Date created) {
			this.created = created;
		}
	}
