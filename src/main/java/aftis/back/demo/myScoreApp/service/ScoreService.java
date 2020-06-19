package aftis.back.demo.myScoreApp.service;

import java.util.List;

import aftis.back.demo.myScoreApp.entity.Score;

public interface ScoreService {
	
	
	
	public List<Score> findAll();
	
	public Score findById(int id);
	
	public void save(Score score);
	
	public void deleteById(int id);
	
	

}
