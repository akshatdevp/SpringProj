package com.dbs.PayZ.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import com.dbs.PayZ.Entities.BooleanUtil;
import com.dbs.PayZ.Entities.Receiver;
import com.dbs.PayZ.Services.ReceiverService;
import com.dbs.PayZ.util.Utility;

@RestController
@RequestMapping("receiver")
public class ReceiverController {
	private ReceiverService recService;
	public ReceiverController(ReceiverService rs)
	{
		this.recService = rs;
	}
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Receiver> getCusomterById(@PathVariable String id){
		Optional<Receiver> customer = recService.geReceiverById(id);
		return Utility.fromOpt(customer);
	} 
	@GetMapping
	@ResponseBody
	public ResponseEntity<Boolean> isOnSDN(@RequestBody BooleanUtil accHolder){
		return ResponseEntity.ok().body(recService.isOnSDN(accHolder.getAccHolderName()));
	}
}
