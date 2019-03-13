package hola.mundo;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/test")
public class HelloController {

    @Get("/hello")
    public String Hello(){
        return "Hola Mundo desde Micronaut";
    }
}
