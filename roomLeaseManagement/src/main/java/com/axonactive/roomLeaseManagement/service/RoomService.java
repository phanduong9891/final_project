package com.axonactive.roomLeaseManagement.service;

import com.axonactive.roomLeaseManagement.entity.Room;

import java.util.List;
import java.util.Optional;

public interface RoomService {
    List<Room> getAll();
    Room save(Room room);
    Optional<Room> findById(Integer id);
    void deleteById(Integer id);
}