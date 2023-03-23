package practica;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("practica")
public class DireccionConfig {

    @Bean

    public Direccion direccion(){
        return new DireccionImpl();
    }

    @Bean
    public  Empleados jefe(){
        return new Jefe(direccion());
    }

}
