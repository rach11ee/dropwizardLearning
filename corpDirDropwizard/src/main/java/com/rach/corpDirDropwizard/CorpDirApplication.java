package com.rach.corpDirDropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CorpDirApplication extends Application<CorpDirConfiguration> {
	public static void main(String[] args) throws Exception{
		new CorpDirApplication().run(args);
	}
	
	@Override
	public void initialize(Bootstrap<CorpDirConfiguration> bootstrap) {
		// nothing to do yet
	}
	
	@Override
	public void run(CorpDirConfiguration configuration,Environment environment) {
		final CorpDirResource resource = new CorpDirResource(configuration.getPackages(),
								configuration.getUrl(),configuration.getUser(),configuration.getPassword());
		environment.jersey().register(resource);
	}
						

}
