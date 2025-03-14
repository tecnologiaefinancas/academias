package com.tecnologiaefinancas.academias.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String city;
    private String neighborhood;
    private String whatsapp;
    private String website;
    private String instagram;

    private String imageUrl;

    private String mapUrl;
    private String googleRate;

    public Gym() {
    }

    public Gym(Long id, String name, String address, String city, String neighborhood, String whatsapp, String website, String instagram, String imageUrl, String mapUrl, String googleRate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.neighborhood = neighborhood;
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
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", whatsapp='" + whatsapp + '\'' +
                ", website='" + website + '\'' +
                ", instagram='" + instagram + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                ", googleRate='" + googleRate + '\'' +
                '}';
    }
}