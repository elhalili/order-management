package ac.usmba.estf.gl.ordermanagement;

import com.pfe.framework.app.Application;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/rest/*")
public class MyApplication extends Application {
    @Override
    protected void execute() throws Exception {
        // create a rest api only from models
        generateRest();
    }
}
