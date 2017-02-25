package com.shaik.model;

/**
 * Created by jabbars on 2/25/2017.
 */
public class Path {

    private String from;
    private String to;
    private Double distance;


    public Path(String from, String to, Double distance) {
        this.from = from;
        this.to = to;
        this.distance = distance;
    }
}
