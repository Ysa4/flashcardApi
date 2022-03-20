package com.yeabsira.FlashCardApi.controller;

import com.yeabsira.FlashCardApi.model.Card;
import com.yeabsira.FlashCardApi.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CardController {


    @Autowired
    private CardService service;

    @PostMapping
    public ResponseEntity addCard(@RequestBody Card newCard)
    {
        service.addCard(newCard);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public  ResponseEntity<List<Card>> getAllCards()
    {
        return ResponseEntity.ok(service.getAllCards());
    }

    @GetMapping("/{id}")
    public ResponseEntity getCard(@PathVariable String id)
    {
        return  ResponseEntity.ok(service.getCard(id));
    }

    @PutMapping
    public ResponseEntity updateCard(@RequestBody Card card)
    {
        service.updateCard(card);
        return  ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCard(@PathVariable String id)
    {
       service.deleteCard(id);
        return ResponseEntity.noContent().build();
    }
}
