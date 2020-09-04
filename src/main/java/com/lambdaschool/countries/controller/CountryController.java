package com.lambdaschool.countries.controller;

import com.lambdaschool.countries.Repos.CountryRepo;
import com.lambdaschool.countries.models.Countries;
import org.hibernate.annotations.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryRepo countryrepos;

    private List<Countries> findCountries(List<Countries> myList, CheckCountry checker) {
        List<Countries> tempList = new ArrayList<>();

        for (Countries c : myList) {
            if(checker.check(e)) {
                tempList.add(e);
            }
        }
        return tempList;
    }

}
