package deoliveira.vinicius.exemploinjecaodedependencia.model;

import deoliveira.vinicius.exemploinjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Author Vinícius de Oliveira
 */
@Component
@Primary
@Qualifier("dog")
public class Dog implements AnimalInterface {
    @Override
    public void comunicar() {
        System.out.println("Au au");
    }
}
