package com.hibernate.test;

import com.hibernate.entity.Client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializingInput {

    public static void main(String[] args) throws Exception {
        FileInputStream input = new FileInputStream("object.txt");

        ObjectInputStream stream = new ObjectInputStream(input);

        Client client = (Client) stream.readObject();

        System.out.println(client.getName());

        stream.close();
    }
}
