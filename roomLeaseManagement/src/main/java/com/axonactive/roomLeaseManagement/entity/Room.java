package com.axonactive.roomLeaseManagement.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private int roomNumber;

    private String roomType;

    @Column
    @Enumerated(EnumType.STRING)
    private RoomStatus status;

    @JoinColumn
    @ManyToOne
    private Owner owner;

}
