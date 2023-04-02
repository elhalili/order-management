package ac.usmba.estf.gl.ordermanagement.dao;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.pfe.framework.annotations.DataSource;
import com.pfe.framework.persistence.Persistence;
import ac.usmba.estf.gl.ordermanagement.models.Client;

import java.sql.SQLException;
import java.util.List;

@DataSource("client")
public class ClientDao implements Persistence<Client> {
    private Dao<Client, Integer> clientDao = DaoManager.createDao(SingletonConnection.getInstance(), Client.class);

    public ClientDao() throws SQLException {
    }

    @Override
    public List<Client> getAll() {
        try {
            return clientDao.queryForAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Client> getLimit(Integer integer) {
        return null;
    }

    @Override
    public Client getById(Object o) {
        Integer id = (Integer) o;
        try {
            return clientDao.queryForId(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Client save(Client client) {
        try {
            clientDao.create(client);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return client;
    }

    @Override
    public Client update(Client client) {
        try {
            clientDao.update(client);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return client;
    }

    @Override
    public Client delete(Client client) {
        try {
            clientDao.delete(client);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return client;
    }
}
