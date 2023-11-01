package rent.a.car.business.concretes;

import rent.a.car.business.abstracts.BrandService;
import rent.a.car.dao.abstracts.BrandDao;
import rent.a.car.entities.concretes.Brand;

import java.util.List;

public class BrandsServiceImpl implements BrandService {

    private BrandDao brandDao;

    public BrandsServiceImpl(BrandDao brandDao) {
        this.brandDao = brandDao;
    }

    @Override
    public List<Brand> getAll() {
        return brandDao.getAll();
    }
}
