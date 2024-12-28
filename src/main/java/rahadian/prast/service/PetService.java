package rahadian.prast.service;

import rahadian.prast.model.Pet;

import java.util.Set;

/**
 * @Author ian
 * @create 28/12/24 19.51
 */
public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
