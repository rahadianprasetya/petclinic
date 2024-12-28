package rahadian.prast.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Author ian
 * create 28/12/24 17.43
 */
@Getter
@Setter
public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

}
