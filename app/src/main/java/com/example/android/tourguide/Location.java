package com.example.android.tourguide;

public class Location {

    private String locationName;
    private String region = "Unknown";
    private String contact = "None";
    private String website = "None";
    private int imageId = -1;

    public Location(String locationName, String region, String contact, String website, int imageId) {
        this.locationName = locationName;
        this.region = region;
        this.contact = contact;
        this.website = website;
        this.imageId = imageId;
    }

    public Location(String locationName, String region, String contact, String website) {
        this.locationName = locationName;
        this.region = region;
        this.contact = contact;
        this.website = website;
    }

    public Location(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getRegion() {
        return region;
    }

    public String getContact() {
        return contact;
    }

    public String getWebsite() {
        return website;
    }

    public int getImageId() {
        return imageId;
    }
}
