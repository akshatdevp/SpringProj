package com.dbs.PayZ.Controllers;

import org.springframework.stereotype.Controller;

import com.dbs.PayZ.Services.ReceiverService;

@Controller
public class ReceiverController {
	private ReceiverService recService;
	public ReceiverController(ReceiverService rs)
	{
		this.recService = rs;
	}

	
}
