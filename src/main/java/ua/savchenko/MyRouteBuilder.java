package ua.savchenko;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("weather:foo?location=Kiev,Ukraine&period=7 days&appid=6af9f1efb8ecc65597e333137641c232").
                to("file:src/main/resources/to/");
    }
}
