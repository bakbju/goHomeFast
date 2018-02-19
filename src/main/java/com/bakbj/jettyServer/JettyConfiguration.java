package com.bakbj.jettyServer;

import org.eclipse.jetty.server.*;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyServerCustomizer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JettyConfiguration {
//    private void customizeJetty(JettyEmbeddedServletContainerFactory container) {
//
//        container.addServerCustomizers(new JettyServerCustomizer() {
//
//            @Override
//            public void customize(Server server) {
//
//                // HTTP
//                ServerConnector connector = new ServerConnector(server);
//                connector.setPort(8080);
//
//                // HTTPS
//                SslContextFactory sslContextFactory = new SslContextFactory();
//                sslContextFactory.setKeyStorePath("/keystore.ks"); //Specify the location for the keystore.jks
//                sslContextFactory.setKeyStorePassword("73037027pbjP!"); //Hardcoding the password for the keystore.
//
//                HttpConfiguration https = new HttpConfiguration();
//                https.addCustomizer(new SecureRequestCustomizer());
//
//                ServerConnector sslConnector = new ServerConnector(
//                        server,
//                        new SslConnectionFactory(sslContextFactory, "http/1.1"),
//                        new HttpConnectionFactory(https));
//                sslConnector.setPort(8443);
//
//                server.setConnectors(new Connector[]{connector, sslConnector});
//
//            }
//        });
//    }
}
