package com.cricket.apis.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.apis.entities.Match;
import com.cricket.apis.services.MatchServiceImpl;

@RestController
@RequestMapping("/match")
public class MatchController {
	private MatchServiceImpl matchServiceImpl;

	public MatchController(MatchServiceImpl matchServiceImpl) {
		super();
		this.matchServiceImpl = matchServiceImpl;
	}

	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches() {
		return new ResponseEntity<List<Match>>(this.matchServiceImpl.getLiveMatches(), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches() {
		return new ResponseEntity<List<Match>>(this.matchServiceImpl.getAllMatches(), HttpStatus.OK);
	}

	@GetMapping("/point-table")
	public ResponseEntity<?> getPointTable() {
		return new ResponseEntity<>(this.matchServiceImpl.getCWC2023PointTable(), HttpStatus.OK);

	}
}
