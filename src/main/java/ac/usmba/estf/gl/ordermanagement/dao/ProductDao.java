package ac.usmba.estf.gl.ordermanagement.dao;

import ac.usmba.estf.gl.ordermanagement.models.Product;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.pfe.framework.annotations.DataSource;
import com.pfe.framework.persistence.Persistence;

import java.sql.SQLException;
import java.util.List;

@DataSource("product")
public class ProductDao implements Persistence<Product> {
    private Dao<Product, Integer> productDao = DaoManager.createDao(SingletonConnection.getInstance(), Product.class);

    public ProductDao() throws SQLException {
    }

    @Override
    public List<Product> getAll() {
        try {
            return productDao.queryForAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> getLimit(Integer integer) {
        return null;
    }

    @Override
    public Product getById(Object o) {
        Integer id = (Integer) o;
        try {
            return productDao.queryForId(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product save(Product product) {
        try {
            productDao.create(product);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public Product update(Product product) {
        try {
            productDao.update(product);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public Product delete(Product product) {
        try {
            productDao.delete(product);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }
}
