package com.yeabsira.FlashCardApi.repository;

import com.yeabsira.FlashCardApi.model.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardsRepostory extends MongoRepository<Card,String> {
}
