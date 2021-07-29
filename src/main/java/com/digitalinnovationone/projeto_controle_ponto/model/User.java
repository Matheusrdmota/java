package com.digitalinnovationone.projeto_controle_ponto.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private UserCategory userCategory;
    private String name;
    @ManyToOne
    private Enterprise enterprise;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private WorkHours workHours;
    private BigDecimal latenessTolerance;
    private LocalDateTime beginToWork;
    private LocalDateTime endToWork;
}
