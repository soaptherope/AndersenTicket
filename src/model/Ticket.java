package model;

import java.math.BigDecimal;

public class Ticket {

    private String Id;

    private String concertHall;

    private short eventCode;

    private long timeOfCreation;

    private long timeOfEvent;

    private boolean isPromo;

    private char stadiumSector;

    private float maxBackpackWeight;

    private BigDecimal price;

    public Ticket(String Id, String concertHall, short eventCode, long timeOfEvent, boolean isPromo, char stadiumSector, float maxBackpackWeight, BigDecimal price) {
        setId(Id);
        setConcertHall(concertHall);
        setEventCode(eventCode);
        setTimeOfEvent(timeOfEvent);
        this.timeOfCreation = System.currentTimeMillis() / 1000L;
        setPromo(isPromo);
        setStadiumSector(stadiumSector);
        setMaxBackpackWeight(maxBackpackWeight);
        setPrice(price);
    }

    public Ticket() {}

    public Ticket(String concertHall, short eventCode, long timeOfEvent) {
        setConcertHall(concertHall);
        setEventCode(eventCode);
        setTimeOfEvent(timeOfEvent);
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        if (id.length() > 4 && id.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Illegal ID");
        }
        this.Id = id;
    }

    public String getConcertHall() {
        return concertHall;
    }

    public void setConcertHall(String concertHall) {
        if (concertHall.length() > 10 && concertHall.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Illegal concert hall");
        }
        this.concertHall = concertHall;
    }

    public short getEventCode() {
        return eventCode;
    }

    public void setEventCode(short eventCode) {
        if (eventCode > 999) {
            throw new IllegalArgumentException("Illegal event code");
        }
        this.eventCode = eventCode;
    }

    public long getTimeOfCreation() {
        return timeOfCreation;
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
        if (stadiumSector == 'A' || stadiumSector == 'B' || stadiumSector == 'C') {
            this.stadiumSector = stadiumSector;
        } else {
            throw new IllegalArgumentException("Illegal stadium sector");
        }
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

    public long getTimeOfEvent() {
        return timeOfEvent;
    }

    public void setTimeOfEvent(long timeOfEvent) {
        this.timeOfEvent = timeOfEvent;
    }
}
