/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * CardTrick class models a hand of seven cards
 * Modifier: Simran kaur
 * Student Number: 991725136
 * Date Modified: 22April2024
 */
import java.util.Random;

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

        // Ask the user to pick a card
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Pick a card (value and suit, e.g., '2 of Hearts'): ");
        String userCard = scanner.nextLine();

        // Search for the card in the hand
        boolean found = false;
        for (Card card : hand) {
            if (card.toString().equalsIgnoreCase(userCard)) {
                found = true;
                break;
            }
        }

        // Report whether the card is in the hand
        if (found) {
            System.out.println("Your card is in the hand!");
        } else {
            System.out.println("Your card is not in the hand.");
        }
    }
}

    
    
    
        
        
        
        
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    
    

