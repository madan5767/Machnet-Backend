package com.example.NepaliShareMarket.repository;

import com.example.NepaliShareMarket.entity.Nepse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NepseRepository extends JpaRepository<Nepse,Integer> {
    Nepse findByCompanyName(String companyName);
}
