package com.digitalinnovationone.projeto_controle_ponto.service;

import com.digitalinnovationone.projeto_controle_ponto.model.WorkHours;
import com.digitalinnovationone.projeto_controle_ponto.repository.WorkHoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkHoursService {
    @Autowired
    WorkHoursRepository workHoursRepository;

    public WorkHours insertWorkHours(WorkHours workHours){
        return workHoursRepository.save(workHours);
    }

    public List<WorkHours> readWorkHours(){
        return workHoursRepository.findAll();
    }

    public Optional<WorkHours> readWorkHoursById(Long id){
        return workHoursRepository.findById(id);
    }

    public void updateWorkHours(WorkHours workHours){
        workHoursRepository.save(workHours);
    }

    public void deleteWorkHours(Long id){
        workHoursRepository.deleteById(id);
    }

}
