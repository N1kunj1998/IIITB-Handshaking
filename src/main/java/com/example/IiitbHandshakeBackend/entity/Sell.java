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
public class Sell {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;
    private String name;
    private String image;
    private int rollNo;
    private int price;
    private boolean available;

    public Sell(String name, String image, int rollNo, int price, boolean available) {
        this.name = name;
        this.image = image;
        this.rollNo = rollNo;
        this.price = price;
        this.available = available;
    }
}
