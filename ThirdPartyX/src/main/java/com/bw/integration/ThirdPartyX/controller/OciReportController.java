package com.bw.integration.ThirdPartyX.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bw.integration.ThirdPartyX.models.OciReport;

@RequestMapping("/api")
@RestController
public class OciReportController {
	  
	@GetMapping("/ping")
	String ping() {
	    return "Keep-Alive";
	}
	
	@PutMapping("/report/{id}")
	OciReport storeReport(@RequestBody OciReport report, @PathVariable String id) {
		return report;
	}
	
}
