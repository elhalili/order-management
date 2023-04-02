package ac.usmba.estf.gl.ordermanagement.dao;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public class SingletonConnection {
    private static ConnectionSource connection;
    public static ConnectionSource getInstance() {
        if (connection == null) {
            try {
                connection = new JdbcConnectionSource("jdbc:mysql://localhost:3306/order_management", "root", "");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

        return connection;
    }
}
