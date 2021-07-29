package com.digitalinnovationone.projeto_controle_ponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendar {
    @Id
    private long id;
    @ManyToOne
    private DateType dateType;
    private String description;
    private LocalDateTime especialDate;
}
