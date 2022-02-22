package com.irgek.persistence;

import com.irgek.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository <City, CityRepositoryCustom>, QuerydslPredicateExecutor<City>, CityRepositoryCustom {
    Optional<City> findCityByName(String name);
}
