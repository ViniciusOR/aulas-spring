package deoliveira.vinicius.exemploinjecaodedependencia.model;

import deoliveira.vinicius.exemploinjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cat")
public class Cat implements AnimalInterface {
    @Override
    public void comunicar() {
        System.out.println("Miau");
    }
}
