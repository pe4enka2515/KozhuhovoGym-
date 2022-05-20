package com.kozhuhovogym.kursovaya.repo;

import com.kozhuhovogym.kursovaya.models.group;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface groupRepository extends CrudRepository<group, Long> {

}
