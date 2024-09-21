package com.businesscard.businesscard.Service;

import com.businesscard.businesscard.Data.BusinessCard;
import com.businesscard.businesscard.repository.BusinessCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BusinessCardServiceImpl implements BusinessCardService{
    private final BusinessCardRepository businessCardRepository;
    @Override
    @Transactional
    public void saveCard(BusinessCard businessCard) {
        businessCardRepository.save(businessCard);
    }
    @Override
    public List<BusinessCard> findBusinessCardByName(String name) {
//        List<BusinessCard> cardList = businessCardRepository.findByName(name);
        List<BusinessCard> cardList = businessCardRepository.findByNameContaining(name);
        return cardList;
    }
}
