package com.tecnologiaefinancas.academias.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String address;
    private String whatsapp;
    private String website;
    private String instagram;
    private String imageUrl;
    private String mapUrl;
    private String googleRate;

    public Gym() {
    }

    public Gym(String title, String address, String whatsapp, String website, String instagram, String imageUrl, String mapUrl, String googleRate) {
        this.title = title;
        this.address = address;
        this.whatsapp = whatsapp;
        this.website = website;
        this.instagram = instagram;
        this.imageUrl = imageUrl;
        this.mapUrl = mapUrl;
        this.googleRate = googleRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    public String getGoogleRate() {
        return googleRate;
    }

    public void setGoogleRate(String googleRate) {
        this.googleRate = googleRate;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", whatsapp='" + whatsapp + '\'' +
                ", website='" + website + '\'' +
                ", instagram='" + instagram + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                ", googleRate='" + googleRate + '\'' +
                '}';
    }
}