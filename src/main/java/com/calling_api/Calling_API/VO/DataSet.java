package com.calling_api.Calling_API.VO;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataSet {
    
    @JsonProperty("latest_photos")
    List<LatestPhotos> latestPhotos = new ArrayList<>();

    public List<LatestPhotos> getLatestPhotos() {
        return latestPhotos;
    }

    public void setLatestPhotos(List<LatestPhotos> latestPhotos) {
        this.latestPhotos = latestPhotos;
    }

    @Override
    public String toString() {
        return "DataSet [latestPhotos=" + latestPhotos + "]";
    }   
}