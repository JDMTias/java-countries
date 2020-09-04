package com.lambdaschool.countries.Repos;

import com.lambdaschool.countries.models.Countries;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepo extends CrudRepository<Countries, Long> {
}
