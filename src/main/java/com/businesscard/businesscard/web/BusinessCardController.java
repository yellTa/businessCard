package com.businesscard.businesscard.web;

import com.businesscard.businesscard.Data.BusinessCard;
import com.businesscard.businesscard.Service.BusinessCardService;
import com.businesscard.businesscard.repository.BusinessCardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class BusinessCardController {

    private final BusinessCardService businessCardService;

    @PostMapping("/register")
    public String registerBusinessCard(
            @RequestParam("name") String name,
            @RequestParam("phone") String phone,
            @RequestParam("companyName") String companyName,
            Model model

    ){
        BusinessCard businessCard = new BusinessCard(name,phone,companyName, LocalDateTime.now());
        businessCardService.saveCard(businessCard);

        //model , 컨트롤러에서 ㅊ ㅓ리한 데이터(모델, 객체) 를 뷰 템플릿에 넘기기 위해 사용된다.
        // 주로 타임리프, JSP같은 뷰 템플릿 엔진에서 데이터를 활용해 THML에 동적으로 표시한다.
        //model객체는 키-값 쌍으로 데이터를 저장하고, 템플릿 엔진에서 해당 키를 통해 값을 참조
        model.addAttribute("message", "명함이 성공적으로 등록되었습니다!");
        return "index"; // 성공 메시지를 보여주면서 다시 메인 페이지로 이동
    }
    @PostMapping("/search")
    public String searchResult(@RequestParam("searchName") String searchName, Model model){
//        List<BusinessCard> results = businessCardRepository.findByName(searchName);

        List<BusinessCard> results = businessCardService.findBusinessCardByName(searchName);

        model.addAttribute("results", results);
        model.addAttribute("searchName", searchName);

        return "searchList";
    }

}
