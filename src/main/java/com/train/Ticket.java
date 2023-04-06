package com.train;

public class Ticket {
    int totalTickets;
    int roundTickets;
    int singleTickets;
    int singlePrice = 1000;

    public Ticket(int totalTickets, int roundTickets) {
        this.totalTickets = totalTickets;
        this.roundTickets = roundTickets;
        this.singleTickets = totalTickets - roundTickets;
    }

    public int sum() {
        int sum = (int)(roundTickets * 2 * singlePrice * 0.9) + singleTickets * singlePrice;
        return sum;
    }

    public void print() {
        System.out.println("Total ticket: " + "\t" + totalTickets);
        System.out.println("Round-trip: " + "\t" + roundTickets);
        System.out.println("Total: " + "\t" + sum());
    }
}
