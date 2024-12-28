package rahadian.prast.service.map;

import rahadian.prast.model.Owner;
import rahadian.prast.model.Vet;
import rahadian.prast.service.CrudService;

import java.util.Set;

/**
 * Author ian
 * create 28/12/24 21.21
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
