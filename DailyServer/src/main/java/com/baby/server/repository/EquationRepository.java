package com.baby.server.repository;

import com.baby.server.model.SecretEquations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EquationRepository extends JpaRepository<SecretEquations, Integer> {
   SecretEquations findSecretEquationsById(int id);
}
