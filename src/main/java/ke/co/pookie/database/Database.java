package ke.co.pookie.database;

import org.sql2o.Sql2o;

public class Database {
        //connecting database
    private static final Sql2o connection = new Sql2o (

                "jdbc:postgresql://localhost:5432/wildlife_tracker_db",
                "postgres",
                "01234"
        );

    public static Sql2o getConnection() { return connection; }

    }

