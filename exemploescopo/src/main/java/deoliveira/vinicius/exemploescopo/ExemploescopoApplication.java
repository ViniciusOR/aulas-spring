package deoliveira.vinicius.exemploescopo;

import deoliveira.vinicius.exemploescopo.dao.ClassDAO;
import deoliveira.vinicius.exemploescopo.dao.ClassJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {

	    ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);

        ClassJDBC objJDBC = applicationContext.getBean(ClassJDBC.class);
        ClassDAO objDAO = applicationContext.getBean(ClassDAO.class);

        ClassJDBC objJDBC1 = applicationContext.getBean(ClassJDBC.class);
        ClassDAO objDAO1 = applicationContext.getBean(ClassDAO.class);

        System.out.println(objJDBC);
        System.out.println(objDAO);

        System.out.println(objJDBC1);
        System.out.println(objDAO1);

	}

}
