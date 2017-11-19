package com.example.decorator;


import java.util.Arrays;

public class UnderscoreText implements Text {

    Text text;

    public UnderscoreText(Text text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return changeSpacesToUndersocreText(text.getText());
    }

    private String changeSpacesToUndersocreText(String text) {
        return text.replace(" ", "_");
    }
}
