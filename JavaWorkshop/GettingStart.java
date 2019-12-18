import com.datastax.driver.core.*;
public class GettingStart{

    public static void main(String[] args) {
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").withPort(9042).build();
        Session session = cluster.connect();
        session.execute("INSERT INTO users(lastname,firstname,age,email) VALUES('doe', 'john', 35, 'john@john-doe.com')");

        cluster.close();
    }
}