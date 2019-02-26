package com.miracle.rest;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;

@ContextName("RestContext")
public class RestRouteBuilder extends RouteBuilder {

  @Override
  public void configure() throws Exception {
    restConfiguration().component("servlet").componentProperty("servletName", "com.miracle.rest.RestServlet");

    rest().produces("application/json")
            .get("/health").route().id("HealthCheck").transform().constant("{ \"status\": \"Alive!\" }");

  }
}
