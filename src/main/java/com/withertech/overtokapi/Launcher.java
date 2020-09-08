package com.withertech.overtokapi;

import com.withertech.overtokapi.resource.OvertokServices;
import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;
import org.jboss.resteasy.plugins.server.servlet.ResteasyBootstrap;

public class Launcher {

    private static final String RESTEASY_SERVLET_NAME = "resteasy-servlet";

    public static void main(String[] args) throws Exception {
        new Launcher().start();
    }

    void start() throws Exception {

        String port = System.getenv("PORT");
        if (port == null || port.isEmpty()) {
            port = "9090";
        }

        String contextPath = "/api";
        String appBase = ".";

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(Integer.valueOf(port));
        tomcat.getHost().setAppBase(appBase);

        Context context = tomcat.addContext(contextPath, appBase);
        context.addApplicationListener(ResteasyBootstrap.class.getName());
        Tomcat.addServlet(context, RESTEASY_SERVLET_NAME, new HttpServletDispatcher());
        context.addParameter("javax.ws.rs.Application", OvertokServices.class.getName());
        context.addServletMapping("/*", RESTEASY_SERVLET_NAME);

        tomcat.start();
        tomcat.getServer().await();
    }
}