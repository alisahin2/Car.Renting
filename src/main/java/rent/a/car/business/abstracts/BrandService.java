package rent.a.car.business.abstracts;

import rent.a.car.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
