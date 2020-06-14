package dao;

import lombok.Getter;
import lombok.Setter;
import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter @Setter

@Component
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Objeto criado");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Objeto finalizado");
    }

}
