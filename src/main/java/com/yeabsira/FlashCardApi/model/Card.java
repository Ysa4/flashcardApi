package com.yeabsira.FlashCardApi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("cards")
public class Card {

    @Id
    private  String id;
    private  String question;
    private  String  answer;
    public Card(){}
    public Card(String question, String answer) {

        this.question = question;
        this.answer = answer;
    }

    public Card(String id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
