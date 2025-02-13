package com.example.demowithstudent.deo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demowithstudent.model.*;

@Repository
public interface StudentResp extends JpaRepository <Student,Integer>{

}