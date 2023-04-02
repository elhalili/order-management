package ac.usmba.estf.gl.ordermanagement.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import com.pfe.framework.annotations.*;

import java.util.List;

@FromDataSource("product")
@Rest
@DatabaseTable(tableName = "product")
public class Product {
    @Id
    @UnRequired
    @DatabaseField(id = true)    private Integer id;
    @DatabaseField
    private String name;
    @DatabaseField
    private Float price;
}
