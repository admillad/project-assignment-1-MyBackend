package se.jensenyh.javacourse.saltmerch.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable {
    @JsonProperty
    public int id;
    @JsonProperty
    public String category;
    @JsonProperty
    public String title;
    @JsonProperty
    public String description;
    @JsonProperty
    public String previewImage;
    @JsonProperty
    public ArrayList<ColorVariant> colorVariants;

    public Product() {
        this.colorVariants = new ArrayList<>();
    }

    public Product(int id, String category, String title, String description, String previewImage) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.previewImage = previewImage;
        this.description = description;
        this.colorVariants = new ArrayList<>();
    }

    public Product(int id, String category, String title, String description, ArrayList<ColorVariant> colorVariants) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.description = description;
        this.colorVariants = colorVariants;
    }
}
