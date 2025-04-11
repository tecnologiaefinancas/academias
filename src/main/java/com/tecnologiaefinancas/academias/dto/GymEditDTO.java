package com.tecnologiaefinancas.academias.dto;

import java.util.List;

public class GymEditDTO {
    private String name;
    private String address;
    private String city;
    private String neighborhood;
    private String whatsapp;
    private String website;
    private String instagram;
    private String reelInstagramUrl;



    private List<String> imageUrl;

    private String mapUrl;
    private String googleRate;

    public GymEditDTO() {
    }

    public GymEditDTO(String name, String address, String city, String neighborhood, String whatsapp, String website, String instagram, String reelInstagramUrl, List<String> imageUrl, String mapUrl, String googleRate) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.neighborhood = neighborhood;
        this.whatsapp = whatsapp;
        this.website = website;
        this.instagram = instagram;
        this.reelInstagramUrl = reelInstagramUrl;
        this.imageUrl = imageUrl;
        this.mapUrl = mapUrl;
        this.googleRate = googleRate;
    }

    public String getGoogleRate() {
        return googleRate;
    }

    public void setGoogleRate(String googleRate) {
        this.googleRate = googleRate;
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    public List<String> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(List<String> imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getReelInstagramUrl() {
        return reelInstagramUrl;
    }

    public void setReelInstagramUrl(String reelInstagramUrl) {
        this.reelInstagramUrl = reelInstagramUrl;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
