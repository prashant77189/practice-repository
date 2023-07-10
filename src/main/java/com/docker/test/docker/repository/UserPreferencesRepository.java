package com.docker.test.docker.repository;

import com.docker.test.docker.Entity.UserPreferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPreferencesRepository extends JpaRepository<UserPreferences,Integer> {
    List<UserPreferences> findAllByCaseId(Integer caseId);
}
