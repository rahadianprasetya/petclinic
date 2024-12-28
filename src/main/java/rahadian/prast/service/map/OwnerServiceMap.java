package rahadian.prast.service.map;

import org.springframework.stereotype.Service;
import rahadian.prast.model.Owner;
import rahadian.prast.service.CrudService;
import rahadian.prast.service.OwnerService;

import java.util.Collections;
import java.util.Set;

/**
 * Author ian
 * create 28/12/24 21.21
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {


    @Override
    public Owner findByLastName(String lastName) {
        return this.findAll()
                .stream()
                .filter(owner -> owner.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
