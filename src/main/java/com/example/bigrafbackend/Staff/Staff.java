package com.example.bigrafbackend.Staff;

public class Staff {
    private int id;
    private String add_staff;
    private String delete_staff;
    private String role;
    private String hours;
    private String sell_tickets;
    private String tickets_sold;
    private String movie_name;
    private String dateTime;
    private String name;
    private String phone;
    private String username;
    private String password;
    private String tom;


    public Staff(String name, String phone, String username, String password, String tom){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.tom = tom;


    }

    public String getTom() {
        return tom;
    }

    public void setTom(String tom) {
        this.tom = tom;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdd_staff() {return add_staff; }

    public void setAdd_staff(String add_staff) {this.add_staff = add_staff;}

    public String getDelete_staff() {return delete_staff; }

    public void setDelete_staff(String delete_staff) {this.delete_staff = delete_staff;}

    public String getRole() {return role; }

    public void setRole(String role) {this.role = role;}

    public String getHours() {return hours;}

    public void setHours(String hours) {this.hours = hours;}

    public String getSell_tickets() {return sell_tickets;}

    public void setSell_tickets(String sell_tickets) {this.sell_tickets = sell_tickets;}

    public String getTickets_sold() {return tickets_sold;}

    public void setTickets_sold(String tickets_sold) {this.tickets_sold = tickets_sold;}

    public String getMovie_name() {return movie_name;}

    public void setMovie_name(String movie_name) {this.movie_name = movie_name;}

    public String getDateTime() {return dateTime;}

    public void setDateTime(String dateTime) {this.dateTime = dateTime;}


    @Override
    public String toString(){
        return "Staff{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Phone='" + phone + '\'' +
                ", Username='" + username + '\'' +
                ", Password='" + password + '\'' +
                ", Add Staff='" + add_staff + '\'' +
                ", Delete Staff='" + delete_staff + '\'' +
                ", Role='" + role + '\'' +
                ", Hours='" + hours + '\'' +
                ", Sell tickets='" + sell_tickets + '\'' +
                ", Tickets Sold='" + tickets_sold + '\'' +
                ", Movie name='" + movie_name + '\'' +
                ", DateTime='" + dateTime + '\'' +
                '}';


    }



}


