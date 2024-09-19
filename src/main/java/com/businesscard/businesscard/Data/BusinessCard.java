package com.businesscard.businesscard.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
public class BusinessCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String phone;
    String companyName;
    LocalDateTime createDate;

    //JPA는 엔티티를 생성할 때 기본 생성자를 필요로 한다.
    //만약 기본 생성자가 없으면 엔티티를 인스턴스화하는 과정에서 문제가 생김 -> 그래서 검색할 때 에러가 났었음
    public BusinessCard() {
    }

    public BusinessCard(String name, String phone, String compnayName, LocalDateTime createDate) {
        this.name = name;
        this.phone = phone;
        this.companyName = compnayName;
        this.createDate = createDate;
    }
}
