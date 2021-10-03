package com.example.NepaliShareMarket.service;

import com.example.NepaliShareMarket.entity.Nepse;
import com.example.NepaliShareMarket.repository.NepseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NepseService {
    @Autowired
    private NepseRepository repository;

    public Nepse saveNepse(Nepse nepse){
        return repository.save(nepse);
    }

    public List<Nepse> saveNepses(List<Nepse> nepses){
        return repository.saveAll(nepses);
    }

    public List<Nepse> getNepse() {
        return repository.findAll();
    }

    public Nepse getNepseById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Nepse getNepseByCompanyName(String companyName) {
        return repository.findByCompanyName(companyName);
    }

    public String deleteNepse(int id) {
        repository.deleteById(id);
        return "Alert!! Nepse "+id+" has been removed !! ";
    }

    public Nepse updateNepse(Nepse nepse) {
        Nepse existingNepse = repository.findById(nepse.getId()).orElse(null);
        existingNepse.setCompanyName(nepse.getCompanyName());
        existingNepse.setNoOfTransactions(nepse.getNoOfTransactions());
        existingNepse.setMaxPrice(nepse.getMaxPrice());
        existingNepse.setMinPrice(nepse.getMinPrice());
        existingNepse.setClosingPrice(nepse.getClosingPrice());
        existingNepse.setTradedShares(nepse.getTradedShares());
        existingNepse.setAmount(nepse.getAmount());
        existingNepse.setPreviousClosing(nepse.getPreviousClosing());
        existingNepse.setDifference(nepse.getDifference());
        return repository.save(existingNepse);
    }

}
