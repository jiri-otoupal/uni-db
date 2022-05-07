package com.unidb;

import java.io.*;

abstract public class Persistable<T> implements IPersist, Serializable {
    private static final String PATH_OUT = "";

    @Override
    public void encode() {
        try (FileOutputStream fos = new FileOutputStream(this.getClass().getName() + ".dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(this);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Object decode() {
        try {
            FileInputStream fileIn = new FileInputStream(this.getClass().getName() + ".dat");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();
            objectIn.close();
            return obj;

        } catch (IOException | ClassNotFoundException e ) {
            e.printStackTrace();;
        }
        throw new RuntimeException();
    }

}
