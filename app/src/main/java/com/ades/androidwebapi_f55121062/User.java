package com.ades.androidwebapi_f55121062;

public class User {
    private String photo;
    private String name;
    private String type;

    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public String getPhoto(){
        return photo;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
