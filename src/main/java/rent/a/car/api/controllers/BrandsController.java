package rent.a.car.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rent.a.car.business.abstracts.BrandService;
import rent.a.car.entities.concretes.Brand;

import java.util.List;

@RestController
@RequestMapping("api/brands")
public class BrandsController {

    private BrandService brandService;


    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<Brand> getAll(){
        return brandService.getAll();
    }
}
