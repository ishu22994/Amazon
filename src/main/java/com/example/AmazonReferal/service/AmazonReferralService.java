package com.example.AmazonReferal.service;

import com.example.AmazonReferal.entity.Referral;

import java.util.Optional;

public interface AmazonReferralService {
    Referral getInfo(String id);

    String addInfo(Referral referral);
}
