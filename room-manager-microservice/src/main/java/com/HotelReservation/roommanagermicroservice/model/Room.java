package com.HotelReservation.roommanagermicroservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Room {

    @Id
    String id;
    String roomName;
    String roomType;
    String availability;

    public Room(String roomName, String roomType, String availability) {
        super();
        this.roomName = roomName;
        this.roomType = roomType;
        this.availability = availability;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getAvailability() { return availability;}

    public void setAvailability(String availability) {this.availability = availability;}

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Room [roomName=" + roomName + ", roomType=" + roomType +", availability=" + availability + "]";
    }

}
