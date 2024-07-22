package model;

import java.math.BigDecimal;

public class Ticket {

    private String Id;

    private String concertHall;

    private byte eventCode;

    private long timeOfCreation;

    private boolean isPromo;

    private char stadiumSector;

    private float maxBackpackWeight;

    private BigDecimal price;

    public Ticket(String Id, String concertHall, byte eventCode, boolean isPromo, char stadiumSector, float maxBackpackWeight, BigDecimal price) {
        this.Id = Id;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.timeOfCreation = System.currentTimeMillis() / 1000L;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxBackpackWeight = maxBackpackWeight;
        this.price = price;
    }

    public Ticket() {}

    public Ticket(String concertHall, byte eventCode) {
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.timeOfCreation = System.currentTimeMillis() / 1000L;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getConcertHall() {
        return concertHall;
    }

    public void setConcertHall(String concertHall) {
        this.concertHall = concertHall;
    }

    public byte getEventCode() {
        return eventCode;
    }

    public void setEventCode(byte eventCode) {
        this.eventCode = eventCode;
    }

    public long getTimeOfCreation() {
        return timeOfCreation;
    }

    public void setTimeOfCreation(long timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public void setPromo(boolean promo) {
        isPromo = promo;
    }

    public char getStadiumSector() {
        return stadiumSector;
    }

    public void setStadiumSector(char stadiumSector) {
        this.stadiumSector = stadiumSector;
    }

    public float getMaxBackpackWeight() {
        return maxBackpackWeight;
    }

    public void setMaxBackpackWeight(float maxBackpackWeight) {
        this.maxBackpackWeight = maxBackpackWeight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
