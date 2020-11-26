package ru.sapteh;

public class Car {
    private Integer cid;
    private String cname;
    private String color;
    private Integer speed;
    private String mfdctry;

    public Car() {
    }
    public Car(Integer cid, String cname, String color, Integer speed,
               String mfdctry) {
        this.cid = cid;
        this.cname = cname;
        this.color = color;
        this.speed = speed;
        this.mfdctry = mfdctry;
    }

    public Integer getCid() {
        return cid;
    }

    public Integer getSpeed() {
        return speed;
    }

    public String getCname() {
        return cname;
    }

    public String getColor() {
        return color;
    }

    public String getMfdctry() {
        return mfdctry;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMfdctry(String mfdctry) {
        this.mfdctry = mfdctry;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
