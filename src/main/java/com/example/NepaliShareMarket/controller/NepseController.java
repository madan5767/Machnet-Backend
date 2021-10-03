package com.example.NepaliShareMarket.controller;

import com.example.NepaliShareMarket.entity.Nepse;
import com.example.NepaliShareMarket.service.NepseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class NepseController {
    @Autowired
    private NepseService service;

    @PostMapping("/addNepse")
    public Nepse addNepse(@RequestBody Nepse nepse) {
        return service.saveNepse(nepse);
    }

    @PostMapping("/addNepses")
    public List<Nepse> addNepses(@RequestBody List<Nepse> nepses) {
        return service.saveNepses(nepses);
    }

    @GetMapping("/nepses")
    public List<Nepse> findAllNepses() {
        return service.getNepse();
    }

    @GetMapping("/nepseById/{id}")
    public Nepse findNepseById(@PathVariable int id) {
        return service.getNepseById(id);
    }

//    @Transactional
    @GetMapping("/nepse/{companyName}")
    public Nepse findNepseByCommpanyName(@PathVariable String companyName) {
        return service.getNepseByCompanyName(companyName);
    }

    @PutMapping("/update")
    public Nepse updateNepse(@RequestBody Nepse nepse) {
        return service.updateNepse(nepse);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteNepse(@PathVariable int id) {
        return service.deleteNepse(id);
    }
}
