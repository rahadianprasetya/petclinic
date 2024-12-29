package rahadian.prast.service.map;

import rahadian.prast.model.BaseEntity;

import java.util.*;

/**
 * Author ian
 * create 28/12/24 21.11
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T entity){
        if (entity != null) {
            if(entity.getId() == null){
                entity.setId(getNextId());
            }
            map.put(entity.getId(), entity);
        }else {
            throw new RuntimeException("entity is null");
        }
        return entity;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T entity){
        map.entrySet().removeIf(entry -> entry.getValue().equals(entity));
    }

    private Long getNextId() {
        Long nextId;
        try {
            nextId = Collections.max(map.keySet()) +1;
        }catch (NoSuchElementException e){
           nextId = 1L;
        }
        return nextId;
    }

}
