package io.github.robwin.endpoint;

public class EndpointResponse {

    private String message;

    public EndpointResponse(){

    }

    public EndpointResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
