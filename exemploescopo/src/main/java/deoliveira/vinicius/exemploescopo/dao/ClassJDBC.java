package deoliveira.vinicius.exemploescopo.dao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author Vinícius de Oliveira
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Classe JDBC");
    }
}
