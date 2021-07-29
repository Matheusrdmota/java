package com.digitalinnovationone.projeto_controle_ponto.controller;

import com.digitalinnovationone.projeto_controle_ponto.model.WorkHours;
import com.digitalinnovationone.projeto_controle_ponto.service.WorkHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/jornada")
public class WorkHoursController {
    @Autowired
    WorkHoursService workHoursService;

    @PostMapping
    public WorkHours createWorkHours(@RequestBody WorkHours workHours){
        return workHoursService.insertWorkHours(workHours);
    }
    @GetMapping
    public List<WorkHours> getWorkHours(){
        return workHoursService.readWorkHours();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<WorkHours> getWorkHoursById(@PathVariable("idJornada") Long idJornada) throws Exception{
        return ResponseEntity.ok(workHoursService.readWorkHoursById(idJornada).orElseThrow( () -> new NoSuchElementException("Not found!") ));
    }

    @PutMapping
    public void updateWorkHours(@RequestBody WorkHours workHours){
        workHoursService.updateWorkHours(workHours);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity<WorkHours> deleteWorkHours(@PathVariable("idJornada") long idJornada){
        try{
            workHoursService.deleteWorkHours(idJornada);
        }
        catch (Exception e){
            System.out.println("Falha na exclusão do registro!");
            e.printStackTrace();
        }
        return (ResponseEntity<WorkHours>) ResponseEntity.ok();
    }
}
