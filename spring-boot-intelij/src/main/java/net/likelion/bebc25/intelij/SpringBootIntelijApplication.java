package net.likelion.bebc25.intelij;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootIntelijApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootIntelijApplication.class, args);
        Driver driver = context.getBean(Driver.class);
        driver.driveCar(80);
        context.close();
    }

}
