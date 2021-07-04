package com.imdadareeph.springwebflux.routes;

import com.imdadareeph.springwebflux.handler.ApplicationHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class ApplicationRouter {

    @Bean
    public RouterFunction<ServerResponse> route(ApplicationHandler applicationHandler) {

        return RouterFunctions
                .route(RequestPredicates
                        .GET("/hello")
                        .and(RequestPredicates
                                .accept(MediaType.TEXT_PLAIN)), applicationHandler::hello);
    }
}
