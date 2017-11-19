package com.example.decorator;

public class Client {

    public static void main(String[] args) {
        Text simple = new SimpleText("Ala na kota");
        System.out.println(simple.getText());

        Text htmlUpperText = new HtmlText(new UpperCase(simple));
        System.out.println(htmlUpperText.getText());

        Text htmlUpperUnderscore = new UnderscoreText(htmlUpperText);
        System.out.println(htmlUpperUnderscore.getText());
    }
}
