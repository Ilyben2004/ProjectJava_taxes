package com.example.projecjava.webservice;


import com.example.projecjava.classes.Redevable;
import com.example.projecjava.service.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/redevable")
public class RedevableWs {
    @Autowired
    private RedevableService redevableService;
    @GetMapping ("getall")
    public List<Redevable> getAll() {
        return redevableService.getAll();
    }
    @PostMapping("add")
    public int add(@RequestBody Redevable redevable)
    {
        return redevableService.add(redevable);
    }

    @DeleteMapping ("delete/{redvableid}")
    public int remove(@PathVariable int redvableid) {
        return redevableService.remove(redvableid);
    }
    @PutMapping ("update")
    public int update(@RequestBody Redevable redevable) {
        return redevableService.update(redevable);
    }
}