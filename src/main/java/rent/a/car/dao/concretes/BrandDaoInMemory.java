package rent.a.car.dao.concretes;

import org.springframework.stereotype.Repository;
import rent.a.car.dao.abstracts.BrandDao;
import rent.a.car.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BrandDaoInMemory implements BrandDao {
    List<Brand> brands;
    public BrandDaoInMemory() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(0,"bmw"));
        brands.add(new Brand(1,"mercedes"));
        brands.add(new Brand(2,"audi"));
        brands.add(new Brand(3,"renault"));
        brands.add(new Brand(4,"toyota"));
    }

    @Override
    public List<Brand> getAll() {
        return null;
    }
}
