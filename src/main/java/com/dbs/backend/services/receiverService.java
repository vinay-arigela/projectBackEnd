package com.dbs.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dbs.backend.receiverModel.receiver;
import com.dbs.backend.repo.ReceiverRepo;

@Service
@Component
public class receiverService {

	@Autowired
	ReceiverRepo receiverRepo;
	
	public List<receiver> getAllReceiverData()
	{
		return receiverRepo.findAll();
	}
}
