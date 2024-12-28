package rahadian.prast.service;

import rahadian.prast.model.Owner;


/**
 * @Author ian
 * @create 28/12/24 19.48
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
