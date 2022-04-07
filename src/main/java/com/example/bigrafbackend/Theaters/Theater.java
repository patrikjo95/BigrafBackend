package com.example.bigrafbackend.Theaters;

public class Theater {
    private int id;
    private int theaterId;
    private String location;

    public Theater(int id, int theaterId, String location, String theaterSeats){
        this.id = id;
        this.theaterId = theaterId;
        this.location = location;


    }

    public int getId() {return id;}

    public void setId(int id) {
        this.id =id;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString(){
        return "Salong{" +
                "ID" + id +
                ", TheaterID" + theaterId +
                ", Location" + location + '\'' +
                '}';

    }

}
