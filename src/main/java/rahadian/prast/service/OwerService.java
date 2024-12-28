package rahadian.prast.service;

import rahadian.prast.model.Owner;

import java.util.Set;

/**
 * @Author ian
 * @create 28/12/24 19.48
 */
public interface OwerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
