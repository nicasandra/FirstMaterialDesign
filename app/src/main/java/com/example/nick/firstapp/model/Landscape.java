package com.example.nick.firstapp.model;

import com.example.nick.firstapp.R;

import java.util.ArrayList;

/**
 * Created by Nick on 3/26/2017.
 */

public class Landscape {
    private int imageId;
    private String title;
    private String description;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Landscape> getData() {

        ArrayList<Landscape> data = new ArrayList<>();
        int[] images = getImages();

        for (int i = 0; i < images.length; i++) {
            Landscape landscape = new Landscape();
            landscape.setImageId(images[i]);
            landscape.setTitle("Landscape " + i);

            data.add(landscape);
        }
        return data;
    }

    public static int[] getImages() {
        int[] data = {
                R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4,
                R.drawable.image_5, R.drawable.image_6, R.drawable.image_7, R.drawable.image_8,
                R.drawable.image_9
        };

        return data;
    }
}
