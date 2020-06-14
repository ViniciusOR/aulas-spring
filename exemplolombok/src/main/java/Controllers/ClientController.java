package Controllers;

import Model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClientController {

    @GetMapping("/client")
    public Client getClient() {

        Client client = new Client();
        client .setName("Vinícius");
        client.setLastName("de Oliveira");
        client.setAge(18);

        return client;
    }

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client();
        client .setName("Vinícius");
        client.setLastName("de Oliveira");
        client.setAge(18);

        Client client1 = new Client();
        client1 .setName("Joao");
        client1.setLastName("Silva");
        client1.setAge(20);

        clients.add(client);
        clients.add(client1);

        return clients;
    }

}
