package com.product;

import java.util.Date;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")

public class ProductServiceApp {
        /**
         * Method handling HTTP GET requests. The returned object will be sent
         * to the client as "text/plain" media type.
         *
         * @return String that will be returned as a text/plain response.
         */
        @GET
        @Produces(MediaType.TEXT_PLAIN)
        public String getIt() {
            return "Got it!";
        }


//    @GET
//    @Produces("text/plain")
//    public Response doGet() {
//        return Response.ok("method doGet invoked " + new Date()).build();
//    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getDirectory(@Context UriInfo uri) {
//        Link selfLink = Link.fromUri(uri.getBaseUri())
//                .rel("self").type(MediaType.APPLICATION_JSON)
//                .build();
//        Link productsLink = Link.fromUri(uri.getBaseUri() + "products")
//                .rel("products").type(MediaType.APPLICATION_JSON)
//                .build();
//
//        return Response.ok()
//                .lastModified(new Date())
//                .location(uri.getRequestUri())
//                .links(selfLink, productsLink)
//                .build();
//    }
    
}