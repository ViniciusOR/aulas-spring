package Controllers;

import Model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Exemplo Lombok";
    }

//    @GetMapping("/product")
//    public String getProduct() {
//        return "Product";
//    }

}
