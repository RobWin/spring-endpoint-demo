package io.github.robwin.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

@Endpoint(id = "test")
@Component
public class TestEndpoint {

    @ReadOperation
    public EndpointResponse helloWorld(@Selector String name){
        return new EndpointResponse("Hello " + name);
    }
}
