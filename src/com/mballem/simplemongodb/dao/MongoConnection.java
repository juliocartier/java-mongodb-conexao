/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mballem.simplemongodb.dao;

/**
 *
 * @author julio
 */
import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * http://www.mballem.com/
 */
public class MongoConnection {

    private static final String HOST = "localhost";
    private static final int PORT = 27017;
    private static final String DB_NAME = "teste";

    private static MongoConnection uniqInstance;
    private static int mongoInstance = 1;

    private Mongo mongo;
    private DB db;

    private MongoConnection() {
        //construtor privado
    }

    //garante sempre uma unica instancia
    public static synchronized MongoConnection getInstance() {
        if (uniqInstance == null) {
            uniqInstance = new MongoConnection();
        }
        return uniqInstance;
    }

    //garante um unico objeto mongo
    public DB getDB() {
        if (mongo == null) {
            try {
                mongo = new MongoClient(HOST, PORT);
                db = mongo.getDB(DB_NAME);
                System.out.println("Mongo instance equals :> " + mongoInstance++);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return db;
    }
}
