package com.hibernate.test;

import com.hibernate.entity.Client;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerializingOutput {

    public static void main(String[] args) throws Exception {
        Client client = new Client("Enzo", 1);

        FileOutputStream fileStream = new FileOutputStream("object.txt");

        ObjectOutputStream conection = new ObjectOutputStream(fileStream);

        conection.writeObject(client);

        conection.close();
    }
}
