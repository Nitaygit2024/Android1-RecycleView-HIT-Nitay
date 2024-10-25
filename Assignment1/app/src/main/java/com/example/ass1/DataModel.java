package com.example.ass1;

public class DataModel {
    private String name;
    private String version;
    private int id_;
    private int image;



    public DataModel(String name, String version, int image, int id_) {
        this.name = name;
        this.version=version;
        this.image = image;
        this.id_ = id_;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public int getId_() {
        return id_;
    }

    public int getImage() {
        return image;
    }
}
