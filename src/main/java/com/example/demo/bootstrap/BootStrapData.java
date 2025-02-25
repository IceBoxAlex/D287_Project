package com.example.demo.bootstrap;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */

        if(partRepository.count() == 0)
        {
            //creating an object from the InhousePart class
            InhousePart headers = new InhousePart();
            
            headers.setName("Long Tube Headers");
            headers.setInv(5);
            headers.setPrice(999.00);
            headers.setId(1002);       

            partRepository.save(headers);

            InhousePart ecuInterface = new InhousePart();
            
            ecuInterface.setName("Engine Tuning Interface");
            ecuInterface.setInv(12);
            ecuInterface.setPrice(699.00);
            ecuInterface.setId(1003);       

            partRepository.save(ecuInterface);

            InhousePart radiator = new InhousePart();
            
            radiator.setName("Aluminum High Capacity Radiator");
            radiator.setInv(5);
            radiator.setPrice(699.00);
            radiator.setId(1005);       

            partRepository.save(radiator);

            InhousePart injectors = new InhousePart();
            
            injectors.setName("1300cc Injectors");
            injectors.setInv(11);
            injectors.setPrice(899.00);
            injectors.setId(1007);       

            partRepository.save(injectors);
            
            InhousePart fuelPump = new InhousePart();
            
            fuelPump.setName("Fuel Pump");
            fuelPump.setInv(15);
            fuelPump.setPrice(349.00);
            fuelPump.setId(1009);       

            partRepository.save(fuelPump);
            //creating an object from the OutsourcedPart class    
            OutsourcedPart airIntakes = new OutsourcedPart();
            
            airIntakes.setName("Stillen 2.5\" intakes");
            airIntakes.setInv(3);
            airIntakes.setPrice(599.00);
            airIntakes.setId(1001);

            outsourcedPartRepository.save(airIntakes);

            OutsourcedPart forcedInduction = new OutsourcedPart();
            
            forcedInduction.setName("Stillen Supercharger");
            forcedInduction.setInv(5);
            forcedInduction.setPrice(7500.00);
            forcedInduction.setId(1004);

            outsourcedPartRepository.save(forcedInduction);

            OutsourcedPart diffBrace = new OutsourcedPart();
            
            diffBrace.setName("Rear Differential Brace");
            diffBrace.setInv(25);
            diffBrace.setPrice(149.00);
            diffBrace.setId(1006);

            outsourcedPartRepository.save(diffBrace);

            OutsourcedPart diffBushings = new OutsourcedPart();
            
            diffBushings.setName("Differential Bushing Set");
            diffBushings.setInv(20);
            diffBushings.setPrice(134.00);
            diffBushings.setId(1008);

            outsourcedPartRepository.save(diffBushings);

            OutsourcedPart transMount = new OutsourcedPart();
            
            transMount.setName("Solid Aluminum Transmission Mount");
            transMount.setInv(18);
            transMount.setPrice(180.00);
            transMount.setId(1010);

            outsourcedPartRepository.save(diffBushings);
        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */
        
        if(productRepository.count() == 0) 
        {
            Product engineOil = new Product("Valvoline 5qt",40.0, 25);
            Product transFluid = new Product("Nissan OEM ATF 5qt",45.0, 17);
            Product coolant = new Product("Nissan OEM Coolant 5qt", 60.0, 20);
            Product tires = new Product("Indy500 255 Front & 285 rear", 1200.0, 5);
            Product brakes = new Product("YellowPads", 120, 12);

            productRepository.save(engineOil);
            productRepository.save(transFluid);
            productRepository.save(coolant);
            productRepository.save(tires);
            productRepository.save(brakes);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
