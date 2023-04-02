package ac.usmba.estf.gl.ordermanagement.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.pfe.framework.annotations.*;

@FromDataSource("orderDetail")
@Rest
@DatabaseTable(tableName = "order_detail")
public class OrderDetail {
    @Id
    @UnRequired
    @DatabaseField(id = true)
    private Integer id;
    @DatabaseField
    private Integer qte;
    @BelongTo
    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "product_id")
    private Product product;
    @BelongTo
    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "order_id")
    private Order order;
}
