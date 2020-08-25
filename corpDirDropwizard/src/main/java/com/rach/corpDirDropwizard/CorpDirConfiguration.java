package com.rach.corpDirDropwizard;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotEmpty;

public class CorpDirConfiguration extends Configuration {
	@NotEmpty
	private String packages;
	
	@NotEmpty
	private String url;
	
	@NotEmpty
	private String user;
	
	@NotEmpty
	private String password;
	
	@JsonProperty
	public String getPackages() {
		return packages;
	}
	
	@JsonProperty
	public void setPackages(String packages) {
		this.packages = packages;
	}
	
	@JsonProperty
	public String getUrl() {
		return url;
	}
	
	@JsonProperty
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty
	public String getUser() {
		return user;
	}
	
	@JsonProperty
	public void setUser(String user) {
		this.user = user;
	}
	
	@JsonProperty
	public String getPassword() {
		return password;
	}
	
	@JsonProperty
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
