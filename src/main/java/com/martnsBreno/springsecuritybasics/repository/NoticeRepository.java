package com.martnsBreno.springsecuritybasics.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.martnsBreno.springsecuritybasics.model.NoticeDetails;

@Repository
public interface NoticeRepository extends CrudRepository<NoticeDetails, Long>{
    
    List<NoticeDetails> findAll();
}
