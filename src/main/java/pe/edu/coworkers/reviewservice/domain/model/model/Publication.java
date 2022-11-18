package pe.edu.coworkers.reviewservice.domain.model.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Publication {
    private Long id;
    private String about;
    private double price;
    private double escrow;
    private String extra_expenses;
    private String gender;
    private boolean availability;
    private int rooms;
    private String bathrooms;
    private float width;
    private float height;
    private String country;
    private String city;
    private String address;
    private boolean visit;
    private int views;
    private float score;
    private int reviews;
}
