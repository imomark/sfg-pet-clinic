package com.omar.sfgpetclinic.bootstrap;

import com.omar.sfgpetclinic.model.Owner;
import com.omar.sfgpetclinic.model.Vet;
import com.omar.sfgpetclinic.service.OwnerService;
import com.omar.sfgpetclinic.service.PetService;
import com.omar.sfgpetclinic.service.VetService;
import com.omar.sfgpetclinic.service.map.OwnerServiceMap;
import com.omar.sfgpetclinic.service.map.PetServiceMap;
import com.omar.sfgpetclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
        this.petService = new PetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Gleane");

        ownerService.save(owner2);

        System.out.println("Loaded Owners ......");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets.......");
    }
}
