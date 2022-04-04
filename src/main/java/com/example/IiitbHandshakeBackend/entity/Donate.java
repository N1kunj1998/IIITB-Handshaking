package com.example.IiitbHandshakeBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table()
public class Donate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int donateId;
    private String name;
    private String image;
    private int rollNo;
    private boolean available;

    public Donate(String name, String image, int rollNo, boolean available) {
        this.name = name;
        this.image = image;
        this.rollNo = rollNo;
        this.available = available;
    }
}
