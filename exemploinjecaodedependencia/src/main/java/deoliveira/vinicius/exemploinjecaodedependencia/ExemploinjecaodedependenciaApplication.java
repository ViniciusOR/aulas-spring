package deoliveira.vinicius.exemploinjecaodedependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author Vinícius de Oliveira
 */
@SpringBootApplication
public class ExemploinjecaodedependenciaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(ExemploinjecaodedependenciaApplication.class, args);
		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();
//
//		Pet pet = new Pet(new Cat());
//		pet.execute();
//
//		Pet pet1 = new Pet(new Dog());
//		pet.execute();

//		Pet pet = new Pet();
//		pet.execute();

	}

}
