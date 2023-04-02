package ac.usmba.estf.gl.ordermanagement.dao;

import ac.usmba.estf.gl.ordermanagement.models.OrderDetail;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.pfe.framework.annotations.DataSource;
import com.pfe.framework.persistence.Persistence;

import java.sql.SQLException;
import java.util.List;

@DataSource("orderDetail")
public class OrderDetailDao implements Persistence<OrderDetail> {
    private Dao<OrderDetail, Integer> orderDetailDao = DaoManager.createDao(SingletonConnection.getInstance(), OrderDetail.class);

    public OrderDetailDao() throws SQLException {
    }

    @Override
    public List<OrderDetail> getAll() {
        try {
            return orderDetailDao.queryForAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<OrderDetail> getLimit(Integer integer) {
        return null;
    }

    @Override
    public OrderDetail getById(Object o) {
        Integer id = (Integer) o;
        try {
            return orderDetailDao.queryForId(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        try {
            orderDetailDao.create(orderDetail);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return orderDetail;
    }

    @Override
    public OrderDetail update(OrderDetail orderDetail) {
        try {
            orderDetailDao.update(orderDetail);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return orderDetail;
    }

    @Override
    public OrderDetail delete(OrderDetail orderDetail) {
        try {
            orderDetailDao.delete(orderDetail);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return orderDetail;
    }
}
