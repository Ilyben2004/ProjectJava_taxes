package com.example.projecjava.dao;

import com.example.projecjava.classes.Redevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RedevableDao extends JpaRepository<Redevable, Long>
{

}