package com.example.projecjava.service;

import com.example.projecjava.classes.TaxeSejourAnuelle;
import com.example.projecjava.dao.TaxeSejourAnuelleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxeSejourAnuelleService {
    @Autowired
    private TaxeSejourAnuelleDao taxeSejourAnuelleDao;

    public int addTaxeSejourAnuelle(TaxeSejourAnuelle taxeSejourAnuelle) {

    taxeSejourAnuelleDao.save(taxeSejourAnuelle);
        return 1;
    }

    public List<TaxeSejourAnuelle> getAllTaxeSejourAnuelle() {
        return taxeSejourAnuelleDao.findAll();
    }

    public int deleteTaxeSejourAnuelle(long id) {
        taxeSejourAnuelleDao.deleteById(id);
        return 1;
    }


}