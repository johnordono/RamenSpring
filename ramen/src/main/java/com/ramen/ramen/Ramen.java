package com.ramen.ramen;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
/**
 Created by P2729496 on 7/3/2017.

This is an example of a Java Bean
Java Bean:
 -1. Serializable object(implements java.io.Serializable)
 -2. has class attributes which must be accessed via accessor and mutator methods that
     follow a standard naming convention (getXxx, setXxx, and isXxx for boolean attributes)
 -3. has a public, no-argument constructor (a default constructor)
*/

@Entity
public class Ramen implements Serializable{

    @Id //Says that "String id" is the Identifier for the Entity
    private String id;
    private String name;
    private String broth;
    private String meat;
    private String noodle;
    private String veg;
    private String photoUrl;
    private double price;

    //No parameter constructor

    public Ramen(){
    }

    /**
     * @param id
     * @param name
     * @param broth
     * @param meat
     * @param noodle
     * @param veg
     * @param price
     */


    public Ramen(String id, String name, String broth, String meat, String noodle, String veg, String photoUrl, double price){
        super();
        this.id = id;
        this.name = name;
        this.broth = broth;
        this.meat = meat;
        this.noodle = noodle;
        this.veg = veg;
        this.photoUrl = photoUrl;
        this.price = price;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getBroth() { return broth; }

    public void setBroth(String broth) { this.broth = broth; }

    public String getMeat() { return meat; }

    public void setMeat(String meat) { this.meat = meat; }

    public String getNoodle() { return noodle; }

    public void setNoodle(String noodle) { this.noodle = noodle; }

    public String getVeg() { return veg; }

    public void setVeg(String veg) { this.veg = veg; }

    public String getPhotoUrl() { return photoUrl; }

    public void setPhotoUrl(String photoUrl) { this.photoUrl = photoUrl; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

}
