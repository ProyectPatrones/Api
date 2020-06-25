package com.example.demo.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Subscription {
    private Integer id;
    private String typeOfSubscription;
    private String time;
    private String paymentMethod;
}
