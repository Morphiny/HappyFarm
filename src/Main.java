import Application.*;
import Space.*;

public class Main {

    public static void main(String[] args) {
        Application myApp= new MyApp();
        myApp.initiate();
        myApp.start();
    }
}

class MyApp extends Application{
    MyApp() {
        super();
    }

    @Override
    public void initiate() {
        super.initiate();
        initiateResourcePool();
    }

    @Override
    public void start() {

    }

    @Override
    public void halt() {
    }

    @Override
    public void end() {

    }

    private void initiateResourcePool(){
        ResourcePool.get_instance().addSpace("Field", new Field());
        ResourcePool.get_instance().addSpace("Zoo", new Zoo());
    }
}