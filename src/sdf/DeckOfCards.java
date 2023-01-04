package sdf;

import java.util.Random;

public class DeckOfCards {

    public static void main(String[] args) {
        

        int[][] deck = new int[14][5];

        for (int i = 1; i < 14; i++) {
            for (int j = 1; j < 5; j++) {
                deck[i][j] = j;
                
            }
        }


        Random rand = new Random();
        
        int rand_row = rand.nextInt(13) + 1;
        int rand_col = rand.nextInt(4) + 1;

        switch (rand_row) {
            case 1: System.out.println("Ace ");
                break;
            case 11: System.out.println("Jack ");
                break;
            case 12: System.out.println("Queen ");
                break;
            case 13: System.out.println("King ");
                break;
            default:
                System.out.printf("%d ",rand_row);
                break;
        }

        switch (rand_col) {
            case 1: System.out.println( "Club");
                break;
            case 2: System.out.println("Diamond");
                break;
            case 3: System.out.println("Heart");
                break;
            case 4: System.out.println("Spade");
                break;
            default:
                System.out.printf("%d ",rand_col);
                break;
        }


        }
    }

    
    
