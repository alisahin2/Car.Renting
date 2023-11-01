package rent.a.car.dao.abstracts;

import org.springframework.stereotype.Repository;
import rent.a.car.entities.concretes.Brand;

import java.util.List;


public interface BrandDao {
    List<Brand> getAll();
}
