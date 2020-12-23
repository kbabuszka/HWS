package net.babuszka.hws.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "readings")
public class Reading {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "station_id", nullable = false)
    private Station station;

    @ManyToOne
    @JoinColumn(name = "unit_id", nullable = false)
    private ReadingUnit unit;

    @Column(name = "value", nullable = false)
    private double value;

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;
}
