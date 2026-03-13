package com.klu.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.fsad.exam.model.TransportModel;
import com.klu.fsad.exam.Repository.TransportRepo;

@Service
public class TransportService 
{

    @Autowired
    private TransportRepo transportRepo;

    // Add Transport
    public TransportModel addTransport(TransportModel t)
    {
        return transportRepo.save(t);
    }

    // Delete Transport
    public String deleteTransport(Integer id)
    {
        transportRepo.deleteById(id);
        return "Transport Deleted Successfully";
    }

}