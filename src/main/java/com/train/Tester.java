package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endBuy = 0;

        while (endBuy != -1) {
            System.out.print("Please enter number of tickets: ");
            int totalTickets = scanner.nextInt();
            System.out.print("How many round-trip tickets: ");
            int roundTickets = scanner.nextInt();

            Ticket ticket = new Ticket(totalTickets, roundTickets);
            ticket.print();

            System.out.print("If you want to exit buying system, you can input -1: ");
            endBuy = scanner.nextInt();
        }
    }
}
