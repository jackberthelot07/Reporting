package org.ensak.dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class ConnexionMDB {
    private static final   String host = "localhost";
    private static final  int port = 27017;
    private static MongoClient mongoClient = null;
    private static DB mongoDatabase = null;


    private ConnexionMDB(String dbName) {
        mongoClient = new MongoClient(host,port);
        mongoDatabase =  mongoClient.getDB(dbName) ;
    }


    public static DB mdbConnexion(String dbname)
    {
        if (mongoClient == null)
            new ConnexionMDB(dbname);
        return mongoDatabase;
    }
}