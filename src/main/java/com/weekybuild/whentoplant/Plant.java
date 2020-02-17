package com.weekybuild.whentoplant;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plant {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer ID;

    private String name;
    private String wks;
    private String before_last_frost;
    private String after_last_frost;
    private String inside_or_outside;
    private String recommended;

    public Plant() {
    }

    public Plant(Integer ID, String name, String wks, String before_last_frost, String after_last_frost, String inside_or_outside, String recommended) {
        this.ID = ID;
        this.name = name;
        this.wks = wks;
        this.before_last_frost = before_last_frost;
        this.after_last_frost = after_last_frost;
        this.inside_or_outside = inside_or_outside;
        this.recommended = recommended;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWks() {
        return wks;
    }

    public void setWks(String wks) {
        this.wks = wks;
    }

    public String getBefore_last_frost() {
        return before_last_frost;
    }

    public void setBefore_last_frost(String before_last_frost) {
        this.before_last_frost = before_last_frost;
    }

    public String getAfter_last_frost() {
        return after_last_frost;
    }

    public void setAfter_last_frost(String after_last_frost) {
        this.after_last_frost = after_last_frost;
    }

    public String getInside_or_outside() {
        return inside_or_outside;
    }

    public void setInside_or_outside(String inside_or_outside) {
        this.inside_or_outside = inside_or_outside;
    }

    public String getRecommended() {
        return recommended;
    }

    public void setRecommended(String recommended) {
        this.recommended = recommended;
    }
}
