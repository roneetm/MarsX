package com.calling_api.Calling_API.VO;

import java.sql.Date;

public class LatestPhotos {
    int id;
    int sol;
    Camera camera;
    String img_src;
    
    @Override
    public String toString() {
        return "LatestPhotos [camera=" + camera + ", earth_date=" + earth_date + ", id=" + id + ", img_src=" + img_src
                + ", rover=" + rover + ", sol=" + sol + "]";
    }
    Date earth_date;
    Rover rover;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSol() {
        return sol;
    }
    public void setSol(int sol) {
        this.sol = sol;
    }
    public Camera getCamera() {
        return camera;
    }
    public void setCamera(Camera camera) {
        this.camera = camera;
    }
    public String getImg_src() {
        return img_src;
    }
    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }
    public Date getEarth_date() {
        return earth_date;
    }
    public void setEarth_date(Date earth_date) {
        this.earth_date = earth_date;
    }
    public Rover getRover() {
        return rover;
    }
    public void setRover(Rover rover) {
        this.rover = rover;
    }
}
