package org.ensak.dao;

import com.mongodb.DB;
import com.mongodb.DBCollection;

public class DataStatistique {
    private static final DB conn = ConnexionMDB.mdbConnexion("test");
    private DBCollection dbCollection1 = conn.getCollection("proceduresLancées");
    private DBCollection dbCollection2 = conn.getCollection("procedures");
    private DBCollection dbCollection3 = conn.getCollection("Archives");


}
