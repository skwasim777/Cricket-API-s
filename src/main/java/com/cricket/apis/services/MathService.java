package com.cricket.apis.services;

import java.util.List;
import java.util.Map;

import com.cricket.apis.entities.Match;

public interface MathService {
	// get all matches
	List<Match> getAllMatches();
    
	// get live matches
	List<Match> getLiveMatches();
    
	// get cwc2024 point table

	List<List<String>> getCWC2023PointTable();
}
