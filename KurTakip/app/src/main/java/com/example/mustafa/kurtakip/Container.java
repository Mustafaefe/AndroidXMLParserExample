package com.example.mustafa.kurtakip;

import java.util.Vector;

/**
 * Created by Mustafa on 23.11.2015.
 */
public class Container {

    private Vector<Kur> vector;

    public Container(){
        this.vector = new Vector<Kur>();
    }

    public Vector<Kur> getVector(){
        return vector;
    }

    public void addToVector(Kur element) {
        vector.add(element);
    }
}

