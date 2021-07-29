package com.digitalinnovationone.projeto_controle_ponto.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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

public class HoursBank {
    @Embeddable
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    public class HoursBankId implements Serializable{
        private long idHoursBank;
        private long idMovimentation;
        private long idUser;
    }
    @Id
    @EmbeddedId
    private HoursBankId hoursBankId;
    private LocalDateTime workHours;
    private BigDecimal workHoursNumber;
    private BigDecimal workHoursBalance;

}
