package rahadian.prast.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;

/**
 * Author ian
 * create 28/12/24 17.43
 */
@Getter
@Setter
@Entity
public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

}
