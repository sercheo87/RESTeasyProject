package com.buraktas.application;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/myRootService")
public class BaseApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		return Collections.emptySet();
	}
}