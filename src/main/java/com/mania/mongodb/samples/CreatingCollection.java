package com.mania.mongodb.samples;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class CreatingCollection {

    public static void main( String args[] ) {

        // Creating a Mongo client
        MongoClient mongo = new MongoClient( "localhost" , 27017 );

        // Creating Credentials
        MongoCredential credential;
        credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
        System.out.println("Connected to the database successfully");

        //Accessing the database
        MongoDatabase database = mongo.getDatabase("myDb");

        //Creating a collection
        database.createCollection("sampleCollection");
        System.out.println("Collection created successfully");
    }
}