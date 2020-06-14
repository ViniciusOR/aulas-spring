package Model;

import lombok.*;

/**
 * @Author Vinícius de Oliveira
 * @Version 1.0
 * @Since 14/06/2020 - 16:23
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client  {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private int age;

    /**
     *
     * @return Client age in months
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }

}
