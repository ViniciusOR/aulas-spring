package deoliveira.vinicius.exemploconstructorpredestroy;

import dao.ClientDAO;
import model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploconstructorpredestroyApplication {

	public static void main(String[] args) {

	ApplicationContext applicationContext = SpringApplication.run(ExemploconstructorpredestroyApplication.class, args);

	ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

	clientDAO.setClient(new Client("Vinícius", "de Oliveira"));

		System.out.println("ClientDAO: " + clientDAO);
		System.out.println("Client: " + clientDAO.getClient().toString());

	}

}
