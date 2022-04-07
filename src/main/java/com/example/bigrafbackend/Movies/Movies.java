package com.example.bigrafbackend.Movies;

public class Movies {
    private int id;
    private int theaterId; //TA BORT SEATSAVAILABLE
    private String name;
    private String dateTime;
    private String seatsAvailable;

    public Movies(int id, int theaterId, String name, String dateTime) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.theaterId = theaterId;
        this.seatsAvailable = seatsAvailable;



    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public String getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(String seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", DateTime='" + dateTime + '\'' +
                ", TheaterID='" + theaterId +
                ", SeatsAvailable='" + seatsAvailable + '\'' +
                '}';
    }
}





