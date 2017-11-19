package com.example.state_example;

public class ClientElement {

    public static void main(String[] args) {
        ContextState contextState = new ContextState();
        for (int i = 0; i < 11; i++) {
            contextState.getState();
        }
    }


}
