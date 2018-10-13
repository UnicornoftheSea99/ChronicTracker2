package com.example.emilyrhyu.chronictracker;

public class Sleep {
    boolean dream;

    Sleep(boolean dream){
        this.dream = dream;
    }

    public String display() {

        String message;

        if (dream) {
            message = "YOU DREAMED! :)";
        } else {
            message = "YOU DID NOT DREAM :(";
        }

        return message;
    }
}
