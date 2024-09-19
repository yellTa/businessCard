package com.businesscard.businesscard.Service;

import com.businesscard.businesscard.Data.BusinessCard;

import java.util.List;

public interface BusinessCardService {

    public void saveCard(BusinessCard businessCard);
    public List<BusinessCard> findBusinessCardByName(String name);


}