package org.example;

public class Park {
    String name;
    int square;
    String purpose;

    public Park(String name, int square, String purpose) {
        this.name = name;
        this.square = square;
        this.purpose = purpose;
    }

    public class Attraction {
        String name;
        String schedule;
        double priceInRubles;

        public Attraction(String name, String schedule, double priceInRubles) {
            this.name = name;
            this.schedule = schedule;
            this.priceInRubles = priceInRubles;
        }

        public String getName() {
            return name;
        }

        public String getSchedule() {
            return schedule;
        }

        public double getPriceInRubles() {
            return priceInRubles;
        }
    }
}
