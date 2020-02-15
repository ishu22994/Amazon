package com.example.AmazonReferal.controller;

import com.example.AmazonReferal.dto.ReferralDTO;
import com.example.AmazonReferal.entity.Referral;
import com.example.AmazonReferal.service.AmazonReferralService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/amazon")
public class AmazonReferralController {

    @Autowired
    AmazonReferralService amazonReferralService;

    @PostMapping(path = "/addinfo",produces = {"application/json"})
    public String addInfo(@RequestBody ReferralDTO referralDTO){
        Referral referral = new Referral();
        BeanUtils.copyProperties(referralDTO,referral);
        String message = amazonReferralService.addInfo(referral);
        return message;
    }


    @GetMapping(path = "/referral-info/{id}",produces = {"application/json"})
    public ResponseEntity<Referral> getInfo(@PathVariable("id") String  id){
        System.out.println("Inside Controller");
       Referral referral = amazonReferralService.getInfo(id);
        System.out.println(referral.toString());
        return new ResponseEntity<Referral>(referral,HttpStatus.OK);
    }

}
