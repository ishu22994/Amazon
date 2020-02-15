package com.example.AmazonReferal.service.Impl;

import com.example.AmazonReferal.entity.Referral;
import com.example.AmazonReferal.repository.AmazonReferralRepository;
import com.example.AmazonReferal.service.AmazonReferralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AmazonReferralServiceImpl implements AmazonReferralService {

    @Autowired
    AmazonReferralRepository amazonReferralRepository;

    @Override
    public Referral getInfo(String id) {
        return amazonReferralRepository.findById(id).get();
    }

    @Override
    public String addInfo(Referral referral) {
        amazonReferralRepository.save(referral);
        return "Info added";
    }
}
