package dev.wcs.nad.tariffmanager.persistence.entity;

import jakarta.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
@Getter
@Setter
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department", orphanRemoval = true)
    private Set<Tariff> tariffs = new LinkedHashSet<>();

    //ajout d'un tariff dans la list d'un departement
    public void addTariff(Tariff tariff) {
        this.getTariffs().add(tariff);
        tariff.setDepartment(this);
    }
}
