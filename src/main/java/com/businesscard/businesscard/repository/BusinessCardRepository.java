package com.businesscard.businesscard.repository;

import com.businesscard.businesscard.Data.BusinessCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessCardRepository extends JpaRepository<BusinessCard, Long> {
    List<BusinessCard> findByName(String name);
    public List<BusinessCard> findByNameContaining(String name);

}
