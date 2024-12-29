package rahadian.prast.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import rahadian.prast.model.Owner;
import rahadian.prast.model.Vet;
import rahadian.prast.service.OwnerService;
import rahadian.prast.service.VetService;

import java.util.Set;

/**
 * Author ian
 * create 28/12/24 22.25
 */
@RestController
public class IndexController {

    private final OwnerService ownerService;
    private final VetService vetService;

    public IndexController(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @GetMapping("/owners")
    public ResponseEntity<Set<Owner>> getOwners() {
        Set<Owner> owners = ownerService.findAll();
        return new ResponseEntity<>(owners, HttpStatus.OK);
    }

    @GetMapping("/owners/{id}")
    public ResponseEntity<Owner> getOwnerById(@PathVariable Long id) {
        Owner owner = ownerService.findById(id);
        return new ResponseEntity<>(owner, HttpStatus.OK);
    }


    @GetMapping("/vets")
    public ResponseEntity<Set<Vet>> getVets() {
        Set<Vet> vets = vetService.findAll();
        return new ResponseEntity<>(vets, HttpStatus.OK);
    }

    @GetMapping("/vets/{id}")
    public ResponseEntity<Vet> getVetById(@PathVariable Long id) {
        Vet vet = vetService.findById(id);
        return new ResponseEntity<>(vet, HttpStatus.OK);
    }

}
