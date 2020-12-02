package com.rpl.splashscreen;

public class Movie {
    private String title;
    private String year;
    private String price;
    private int jumlahBeli;


    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public Movie(String title, String year, String price, int jumlahBeli) {
        this.title = title;
        this.year = year;
        this.price = price;
        this.jumlahBeli = jumlahBeli;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() { return price; }

    public void setPrice(String price) { this.price = price;}

}
