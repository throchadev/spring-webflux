package br.com.throchadev.springwebflux.component;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Component
public class HelloWorldRouter {

  @Bean
  public RouterFunction<ServerResponse> routeHelloWorld(HelloWorldHandler helloWorldHandler) {

    return RouterFunctions.route(RequestPredicates.GET("/helloWorld")
        .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), helloWorldHandler::helloWorld);
  }
}
