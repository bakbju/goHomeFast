//package com.bakbj.redirect;
//
//import org.eclipse.jetty.security.ConstraintMapping;
//import org.eclipse.jetty.security.ConstraintSecurityHandler;
//import org.eclipse.jetty.util.security.Constraint;
//import org.eclipse.jetty.webapp.AbstractConfiguration;
//import org.eclipse.jetty.webapp.WebAppContext;
//
//public class JettyConfiguration extends AbstractConfiguration {
//
//    @Override
//    public void configure(WebAppContext context) throws Exception
//    {
//        Constraint constraint = new Constraint();
//        constraint.setDataConstraint(2);
//
//        ConstraintMapping constraintMapping = new ConstraintMapping();
//        constraintMapping.setPathSpec("/*");
//        constraintMapping.setConstraint(constraint);
//
//        ConstraintSecurityHandler constraintSecurityHandler = new ConstraintSecurityHandler();
//        constraintSecurityHandler.addConstraintMapping(constraintMapping);
//
//        context.setSecurityHandler(constraintSecurityHandler);
//    }
//}
