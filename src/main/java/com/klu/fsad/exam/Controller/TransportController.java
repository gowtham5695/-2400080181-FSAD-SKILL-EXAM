package com.klu.fsad.exam.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.fsad.exam.model.TransportModel;
import com.klu.fsad.exam.service.TransportService;

@RestController
@RequestMapping("/transport")
public class TransportController
{

    @Autowired
    private TransportService transportService;

    @PostMapping("/add")
    public TransportModel addTransport(@RequestBody TransportModel t)
    {
        return transportService.addTransport(t);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTransport(@PathVariable Integer id)
    {
        return transportService.deleteTransport(id);
    }

}