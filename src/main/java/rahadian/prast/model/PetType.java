package rahadian.prast.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Author ian
 * create 28/12/24 17.45
 */
@Getter
@Setter
@Entity
public class PetType extends BaseEntity {
    private String name;


}
