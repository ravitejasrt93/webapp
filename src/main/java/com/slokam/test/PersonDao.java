package com.slokam.test;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slokam.pojo.Person;

public interface PersonDao extends JpaRepository<Person, Integer> {

}
