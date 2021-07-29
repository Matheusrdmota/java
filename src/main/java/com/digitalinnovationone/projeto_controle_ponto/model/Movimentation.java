package com.digitalinnovationone.projeto_controle_ponto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentation {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentationId implements Serializable {
        private long idMovimentation;
        private long idUser;
    }
    @Id
    @EmbeddedId
    private MovimentationId id;
    private LocalDateTime entryDate;
    private LocalDateTime leavingDate;
    private BigDecimal period;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private Calendar calendar;
}
