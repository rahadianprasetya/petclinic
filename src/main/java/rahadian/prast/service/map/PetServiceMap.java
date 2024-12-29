package rahadian.prast.service.map;

import org.springframework.stereotype.Service;
import rahadian.prast.model.Pet;
import rahadian.prast.model.Vet;
import rahadian.prast.service.CrudService;
import rahadian.prast.service.PetService;

import java.util.Set;

/**
 * Author ian
 * create 28/12/24 21.21
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }
}
