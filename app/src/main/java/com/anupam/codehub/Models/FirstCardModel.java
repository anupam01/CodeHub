package com.anupam.codehub.Models;

/**
 * Created by Anupam on 10-06-2017.
 */

public class FirstCardModel {
    private int image;
    private String title;
    private String time;
    private String description;

    public FirstCardModel(int image, String title, String time, String description) {
        this.image = image;
        this.title = title;
        this.time = time;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

}
