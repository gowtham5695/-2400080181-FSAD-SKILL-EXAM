package com.klu.fsad.exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klu.fsad.exam.model.TransportModel;

public interface TransportRepo extends JpaRepository<TransportModel,Integer>
{

}