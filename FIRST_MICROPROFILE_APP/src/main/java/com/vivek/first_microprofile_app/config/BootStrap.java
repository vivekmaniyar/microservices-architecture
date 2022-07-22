package com.vivek.first_microprofile_app.config;
import javax.annotation.security.DeclareRoles;
import javax.ws.rs.ApplicationPath;
import org.eclipse.microprofile.auth.LoginConfig;

@LoginConfig(authMethod = "MP-JWT")
@DeclareRoles({"chief","hacker"})
@SuppressWarnings({"EmptyClass", "SuppressionAnnotation"})
@ApplicationPath("rest")
public class BootStrap extends javax.ws.rs.core.Application {
}
