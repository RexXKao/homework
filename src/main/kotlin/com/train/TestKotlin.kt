package com.train

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var endBuy = 0

    while (endBuy != -1) {
        print("Please enter number of tickets: ")
        val totalTickets = scanner.nextInt()
        print("How many round-trip tickets: ")
        val roundTickets = scanner.nextInt()

        val ticket = TicketKotlin(totalTickets, roundTickets)
        ticket.print()

        print("If you want to exit buying system, you can input -1: ")
        endBuy = scanner.nextInt()
    }
}

class TicketKotlin(var totalTickets :Int, var roundTickets :Int) {
    val singleTickets = totalTickets - roundTickets
    val singlePrice = 1000

    fun sum() :Int {
        val sum = roundTickets * 2 * singlePrice * 0.9 + singleTickets * singlePrice
        return sum.toInt()
    }

    fun print() {
        println(
                "Total Tickets:$totalTickets \n" +
                        "Round-trip:$roundTickets \n" +
                        "Total:${sum()}"
        )
    }
}