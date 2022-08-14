package com.dbs.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.backend.receiverModel.receiver;
import com.dbs.backend.senderModel.sender;
import com.dbs.backend.services.receiverService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class ReceiverController {

	@Autowired
	receiverService receiverServiceObj;
	
	 @RequestMapping("/receiverData")
	    List<receiver> getAllSenderData()
	    {
	        List<receiver> receiverList = receiverServiceObj.getAllReceiverData();
	        return receiverList;
	    }
}
