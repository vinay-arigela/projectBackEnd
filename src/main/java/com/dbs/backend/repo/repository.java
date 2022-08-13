package com.dbs.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.dbs.backend.senderModel.sender;

@Component
public interface repository extends JpaRepository<sender,Long> {

}
