package net.babuszka.hws.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "reading_units")
public class ReadingUnit {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private UnitType type;

    @Column(name = "name")
    private String name;

    @Column(name = "symbol")
    private String symbol;

    @OneToMany(mappedBy = "unit")
    private Set<Reading> readings;
}
