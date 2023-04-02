package ac.usmba.estf.gl.ordermanagement.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.pfe.framework.annotations.*;

import java.util.Date;

@FromDataSource("order")
@Rest
@DatabaseTable(tableName = "order")
public class Order {
    @Id
    @UnRequired
    @DatabaseField(id = true)
    private Integer id;
    @UnRequired
    @DatabaseField
    private Date date;
    @BelongTo
    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "client_num", foreignColumnName = "num")
    private Client client;
}
