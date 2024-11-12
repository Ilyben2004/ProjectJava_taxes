package com.example.projecjava.dao;

import com.example.projecjava.classes.TaxeSejourAnuelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeSejourAnuelleDao extends JpaRepository<TaxeSejourAnuelle, Long>
{

}
