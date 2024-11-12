package com.example.projecjava.classes;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Redevable {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private String adress;
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "redevable")
        private List<TaxeSejourAnuelle> taxeSejourAnuelles;

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<TaxeSejourAnuelle> getTaxeSejourAnuelles() {
        return taxeSejourAnuelles;
    }

    public void setTaxeSejourAnuelles(List<TaxeSejourAnuelle> taxeSejourAnuelles) {
        this.taxeSejourAnuelles = taxeSejourAnuelles;
    }

    public Long getId() {
        return id;
    }
}