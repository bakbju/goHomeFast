//package com.bakbj.redirect;
//
//import org.eclipse.jetty.server.HttpConfiguration;
//import org.eclipse.jetty.server.HttpConnectionFactory;
//import org.eclipse.jetty.server.ServerConnector;
//import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
//import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
//import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class JettyCustomizer implements EmbeddedServletContainerCustomizer {
//
//    @Override
//    public void customize(ConfigurableEmbeddedServletContainer container) {
//        JettyEmbeddedServletContainerFactory containerFactory = (JettyEmbeddedServletContainerFactory) container;
//        containerFactory.addConfigurations(new JettyConfiguration());
//        containerFactory.addServerCustomizers(server -> {
//            HttpConfiguration http = new HttpConfiguration();
//            http.setSecurePort(8443);
//            http.setSecureScheme("https");
//
//            ServerConnector connector = new ServerConnector(server);
//            connector.addConnectionFactory(new HttpConnectionFactory(http));
//            connector.setPort(8080);
//
//            server.addConnector(connector);
//        });
//    }
//}
