package com.businesscard.businesscard.web;

import com.businesscard.businesscard.Data.BusinessCard;
import com.businesscard.businesscard.repository.BusinessCardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class SearchController {
    private final BusinessCardRepository businessCardRepository;

    @PostMapping("/search")
    public String seacrhRestul(@RequestParam("searchName") String searchName, Model model){
//        List<BusinessCard> results = businessCardRepository.findByName(searchName);

        List<BusinessCard> results = businessCardRepository.findByNameContaining(searchName);

        model.addAttribute("results", results);
        model.addAttribute("searchName", searchName);

        return "searchList";
    }

}
