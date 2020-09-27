package com.sut.school_mall.bean;

public class Delivery {
    private Integer deliveryId;

    private String deliveryFrom;

    private String deliveryFromPhone;

    private String deliveryAddress;

    private String deliveryPerson;

    private String deliveryPersonPhone;

    private int deliveryStatus;

    public int getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(int deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryFrom() {
        return deliveryFrom;
    }

    public void setDeliveryFrom(String deliveryFrom) {
        this.deliveryFrom = deliveryFrom;
    }

    public String getDeliveryFromPhone() {
        return deliveryFromPhone;
    }

    public void setDeliveryFromPhone(String deliveryFromPhone) {
        this.deliveryFromPhone = deliveryFromPhone;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryPerson() {
        return deliveryPerson;
    }

    public void setDeliveryPerson(String deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public String getDeliveryPersonPhone() {
        return deliveryPersonPhone;
    }

    public void setDeliveryPersonPhone(String deliveryPersonPhone) {
        this.deliveryPersonPhone = deliveryPersonPhone;
    }

    public Delivery(Integer deliveryId, String deliveryFrom, String deliveryFromPhone, String deliveryAddress, String deliveryPerson, String deliveryPersonPhone, int deliveryStatus) {
        this.deliveryId = deliveryId;
        this.deliveryFrom = deliveryFrom;
        this.deliveryFromPhone = deliveryFromPhone;
        this.deliveryAddress = deliveryAddress;
        this.deliveryPerson = deliveryPerson;
        this.deliveryPersonPhone = deliveryPersonPhone;
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", deliveryFrom='" + deliveryFrom + '\'' +
                ", deliveryFromPhone='" + deliveryFromPhone + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", deliveryPerson='" + deliveryPerson + '\'' +
                ", deliveryPersonPhone='" + deliveryPersonPhone + '\'' +
                ", deliveryStatus=" + deliveryStatus +
                '}';
    }
}
