package org.apache.camel.workshop.credit;
 
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;
 
@Component
public class CreditRoutes extends RouteBuilder {
 
	@Override
	public void configure() {
 
	rest().get("/payments")
        .route()
        .bean("creditStore", "list")
        .marshal().json(JsonLibrary.Jackson);
 
	}
 
}
