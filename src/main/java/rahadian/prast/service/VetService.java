package rahadian.prast.service;



import rahadian.prast.model.Vet;

import java.util.Set;

/**
 * @Author ian
 * @create 28/12/24 19.53
 */
public interface VetService {

    Vet findByLastName(String lastName);
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
