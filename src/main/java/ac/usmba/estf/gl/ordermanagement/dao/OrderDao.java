package ac.usmba.estf.gl.ordermanagement.dao;

import ac.usmba.estf.gl.ordermanagement.models.Order;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.pfe.framework.annotations.DataSource;
import com.pfe.framework.persistence.Persistence;

import java.sql.SQLException;
import java.util.List;

@DataSource("order")
public class OrderDao implements Persistence<Order> {
    private Dao<Order, Integer> orderDao = DaoManager.createDao(SingletonConnection.getInstance(), Order.class);

    public OrderDao() throws SQLException {
    }

    @Override
    public List<Order> getAll() {
        try {
            return orderDao.queryForAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Order> getLimit(Integer integer) {
        return null;
    }

    @Override
    public Order getById(Object o) {
        Integer id = (Integer) o;
        try {
            return orderDao.queryForId(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Order save(Order order) {
        try {
            orderDao.create(order);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return order;
    }

    @Override
    public Order update(Order order) {
        try {
            orderDao.update(order);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return order;
    }

    @Override
    public Order delete(Order order) {
        try {
            orderDao.delete(order);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return order;
    }
}
