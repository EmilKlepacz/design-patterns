package com.example.builder;

import com.example.universum.Distance;

import java.math.BigDecimal;

public class DistanceBuilder {

    BigDecimal distanceInKM;

    public static DistanceBuilder aDistance() {
        return new DistanceBuilder();
    }

    public DistanceBuilder fromMeter(String meter) {
        this.distanceInKM = new BigDecimal(meter);
        return this;
    }

    public Distance build() {
        Distance distance = Distance.createFromMeter(distanceInKM);
        return distance;
    }

    public static void main(String[] args) {
        Distance distance = DistanceBuilder.aDistance().fromMeter("123").build();
        System.out.println(distance);
    }
}
