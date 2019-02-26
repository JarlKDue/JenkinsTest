package com.miracle.rest;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(loadOnStartup = 1, displayName = "com.miracle.rest.RestServlet", urlPatterns = "/api/*", name = "com.miracle.rest.RestServlet")
public class RestServlet extends CamelHttpTransportServlet {
}
