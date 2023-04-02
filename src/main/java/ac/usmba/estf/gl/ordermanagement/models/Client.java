package ac.usmba.estf.gl.ordermanagement.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import com.pfe.framework.annotations.*;

import java.util.List;

@FromDataSource("client")
@Rest
@DatabaseTable(tableName = "client")
public class Client {
    @Id
    @UnRequired
    @DatabaseField(id = true)
    private Integer num;
    @DatabaseField(canBeNull = false)
    private String name;
}
