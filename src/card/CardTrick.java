/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * This class represents a simple card trick game.
 * Modifier: SIMRANKAUR
 * Student Number: 991725136
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        // Array to hold 7 cards
        Card[] hand = new Card[7];
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        Random rand = new Random();

        // Fill the array with random cards
        for (int i = 0; i < hand.length; i++) {
            int value = rand.nextInt(13) + 1; // 1 to 13
            String suit = suits[rand.nextInt(4)]; // 0 to 3
            hand[i] = new Card(value, suit);
        }

        // Print the hand of cards
        System.out.println("Your hand of cards:");
        for (Card card : hand) {
            System.out.println(card);
        }

        // Hard-coded lucky card
        Card luckyCard = new Card(7, "Hearts"); // Example: 7 of Hearts

        // Search for the lucky card in the hand
        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report whether the lucky card is in the hand
        if (found) {
            System.out.println("Your lucky card " + luckyCard + " is in the hand! You win!");
        } else {
            System.out.println("Your lucky card " + luckyCard + " is not in the hand. You lose.");
        }
    }
}
            
        
    


            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    
    

