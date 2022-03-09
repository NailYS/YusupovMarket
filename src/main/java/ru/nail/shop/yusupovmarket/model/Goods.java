package ru.nail.shop.yusupovmarket.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "goods")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor

public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int count;
    private double price;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;
}
