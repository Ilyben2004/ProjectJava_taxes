package com.example.projecjava.service;

import com.example.projecjava.classes.Redevable;
import com.example.projecjava.classes.TaxeSejourAnuelle;
import com.example.projecjava.dao.RedevableDao;
import com.example.projecjava.dao.TaxeSejourAnuelleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class RedevableService
{
    @Autowired
    private RedevableDao redevableDao;
    private TaxeSejourAnuelleDao taxeSejourAnuelleDao;
    public int payTax(Long idRedevable, float amount , Long idTaxSeJourAnuelle)
    {
        TaxeSejourAnuelle taxeSejourAnuelle = taxeSejourAnuelleDao.getReferenceById(idTaxSeJourAnuelle);
        if (taxeSejourAnuelle != null)
        {
            if(taxeSejourAnuelle.getHowMuchPaid() + amount <= taxeSejourAnuelle.getTotalAmount())
            {
                taxeSejourAnuelle.setHowMuchPaid(amount + taxeSejourAnuelle.getHowMuchPaid());
                if(taxeSejourAnuelle.getHowMuchPaid() == taxeSejourAnuelle.getTotalAmount())
                {
                    taxeSejourAnuelle.setPaid(true);
                    taxeSejourAnuelleDao.save(taxeSejourAnuelle);
                }
                return 1;
            }
        }
        return -1;
    }
    public int add(Redevable redevable)
    {
     redevableDao.save(redevable); return 1;
    }
    public int update(Redevable redevable)
    {
        redevableDao.save(redevable);
        return 1;
    }
    public int remove(long idRedevable)
    {
        redevableDao.deleteById(idRedevable);
        return 1;
    }
    public List<Redevable> getAll()
    {
        return redevableDao.findAll();
    }

}
