package rahadian.prast.service;

import java.util.Set;

/**
 * Author ian
 * create 28/12/24 20.59
 */
public interface CrudService<T, ID>{

    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
