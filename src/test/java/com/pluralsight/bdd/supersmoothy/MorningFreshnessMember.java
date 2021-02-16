package com.pluralsight.bdd.supersmoothy;

public class MorningFreshnessMember {
    private String name;
    private SuperSmoothCategory shema ;
    private int earnedPoints;

    //Map<String, Integer> orders = new HashMap<>();
    public MorningFreshnessMember(String nmae, SuperSmoothCategory shema) {
        this.name = nmae;
        this.shema = shema;
    }

    public void orders(Integer amount, String drink) {
         earnedPoints = shema.getPointFor(drink) * amount;
    }

    public int getPoints() {
        return earnedPoints;
    }
}
