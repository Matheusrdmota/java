package com.digitalinnovationone.projeto_controle_ponto.repository;

import com.digitalinnovationone.projeto_controle_ponto.model.WorkHours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkHoursRepository extends JpaRepository<WorkHours, Long> {
}
