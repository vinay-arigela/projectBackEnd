package com.dbs.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.backend.receiverModel.receiver;

public interface ReceiverRepo extends JpaRepository<receiver, String>{

}
