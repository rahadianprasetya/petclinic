package rahadian.prast;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import rahadian.prast.model.Owner;
import rahadian.prast.model.Pet;
import rahadian.prast.model.Vet;
import rahadian.prast.service.OwnerService;
import rahadian.prast.service.VetService;
import rahadian.prast.service.map.OwnerServiceMap;

import javax.annotation.PostConstruct;

/**
 * Author ian
 * create 28/12/24 21.50
 */
@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        initClient();
    }


    public void initClient() {
        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Jane");
        owner2.setLastName("Doe");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Bob");
        vet2.setLastName("Sam");
        vetService.save(vet2);

        System.out.println("============RUNNING OWNER DATA=====================");

    }


}
