package com.yeabsira.FlashCardApi.service;

import com.yeabsira.FlashCardApi.model.Card;
import com.yeabsira.FlashCardApi.repository.CardsRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardsRepostory  repostory;


    public void addCard(Card card)
    {
        repostory.insert(card);
    }

    public List<Card> getAllCards()
   {
       return repostory.findAll();
   }

    public Card getCard(String id)
    {
        return repostory.findById(id)
                .orElseThrow(
                        ()->new RuntimeException("Can not find Card")
                );
    }
   public void updateCard(Card card)
   {
      Card cardFound = repostory.findById(card.getId())
              .orElseThrow(
                      ()-> new RuntimeException(String.format("Can not Find Card by Id %s",card.getId()))
              );
       cardFound.setQuestion(card.getQuestion());
       cardFound.setAnswer(card.getAnswer());

       repostory.save(card);
   }

   public  void deleteCard(String id)
   {
      repostory.deleteById(id);
   }
}
