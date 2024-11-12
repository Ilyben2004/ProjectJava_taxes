package com.example.projecjava.webservice;

import com.example.projecjava.classes.TaxeSejourAnuelle;
import com.example.projecjava.service.TaxeSejourAnuelleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/taxesejouranuelle")
public class TaxeSejourAnuelleWs
{
    @Autowired
    TaxeSejourAnuelleService taxeSejourAnuelleService;

    @PostMapping ("add")
    public int addTaxeSejourAnuelle(@RequestBody TaxeSejourAnuelle taxeSejourAnuelle)
    {

        return taxeSejourAnuelleService.addTaxeSejourAnuelle(taxeSejourAnuelle);
    }
    @GetMapping("getall")
    public List<TaxeSejourAnuelle> getAllTaxeSejourAnuelle()
    {
        return taxeSejourAnuelleService.getAllTaxeSejourAnuelle();
    }
    @DeleteMapping("delete/{id}")
    public int deleteTaxeSejourAnuelle(@PathVariable  long id)
    {
     return   taxeSejourAnuelleService.deleteTaxeSejourAnuelle(id);
    }
    @PutMapping("update")
    public int updateTaxeSejourAnuelle(@RequestBody TaxeSejourAnuelle taxeSejourAnuelle)
    {
        return addTaxeSejourAnuelle(taxeSejourAnuelle);
    }

}