package deoliveira.vinicius.exemploinjecaodedependencia;

import deoliveira.vinicius.exemploinjecaodedependencia.interfaces.AnimalInterface;
import deoliveira.vinicius.exemploinjecaodedependencia.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Author Vinícius de Oliveira
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private AnimalInterface animalInterface;

//    /**
//     *
//     * @param animalInterface
//     */
//    public Pet(AnimalInterface animalInterface) {
//        this.animalInterface = animalInterface;
//    }

    public void execute() {
        animalInterface.comunicar();
    }

//    public void execute() {
//        animalInterface = new Cat();
//        animalInterface.comunicar();
//    }

}
