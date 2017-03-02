package ua.savchenko;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

import java.util.Timer;

public class WeatherComponent extends Timer{

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            CamelContext context = new DefaultCamelContext();
            try {
                context.addRoutes(new MyRouteBuilder() {
                });
                context.start();
                Thread.sleep(10000);
                context.stop();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}