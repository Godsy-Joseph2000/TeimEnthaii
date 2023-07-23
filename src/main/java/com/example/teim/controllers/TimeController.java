package com.example.teim.controllers;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/time")
public class TimeController{
    @GetMapping("/current-time")
	public String getCurrentTime() {
		LocalDateTime currentTime = LocalDateTime.now();
		return "Current time: " + currentTime.toString();
	}	
}
