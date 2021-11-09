package com.example.eventposter.Model;

import java.util.Date;

public class Doctor {
    private int id;
    private String FIO;
    private int Speciality_FK;
    private int area;
    private int parlor;
    private int image;

    public Doctor(int id, String FIO, int Speciality_FK, int area, int parlor, int image) {
        this.id = id;
        this.FIO = FIO;
        this.Speciality_FK = Speciality_FK;
        this.area = area;
        this.parlor = parlor;
        this.image = image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getSpeciality_FK() {
        return Speciality_FK;
    }

    public void setSpeciality_FK(int speciality_FK) {
        Speciality_FK = speciality_FK;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getParlor() {
        return parlor;
    }

    public void setParlor(int parlor) {
        this.parlor = parlor;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
