package com.example.builder;


import com.example.universum.SiderealYear;

import java.math.BigDecimal;

public class SiderealYearBuilder {

    private BigDecimal earthDays;


    public static SiderealYearBuilder aSiderealYear() {
        return new SiderealYearBuilder();
    }

    public SiderealYearBuilder earthDays(int days) {
        this.earthDays = new BigDecimal(days);
        return this;
    }

    public SiderealYear build(){
        SiderealYear siderealYear = new SiderealYear(earthDays);
        return siderealYear;
    }


    public static void main(String[] args) {
        SiderealYear siderealYear = SiderealYearBuilder.aSiderealYear().earthDays(365).build();
        System.out.println(siderealYear);
    }

}
