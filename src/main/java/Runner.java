import db.Seed;

public class Runner {

    private Seed seed;

    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.start();
    }
    public void start(){
        // can now access non-static fields
        seed.seedDB();
    }
}
