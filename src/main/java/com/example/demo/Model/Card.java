package com.example.demo.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Card {
    private Integer id;
    private int amount;
    private int cardNumber;
    private Date dateOfExpiry;
    private int postalCode;
    private String address;
}
