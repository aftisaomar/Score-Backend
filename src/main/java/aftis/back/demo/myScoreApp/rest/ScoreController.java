package aftis.back.demo.myScoreApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aftis.back.demo.myScoreApp.entity.Score;
import aftis.back.demo.myScoreApp.service.ScoreService;

@RestController
@RequestMapping("/api")
public class ScoreController {
	
	ScoreService scoreService;
	
	
	 @Autowired
	 public ScoreController(ScoreService scoreService) {
		 
		 this.scoreService = scoreService;
			 
	}
	
	
	
	@GetMapping("/scores")
	public List<Score> getAllScores(){
		
		return scoreService.findAll();
		
	}
	
	
	@GetMapping("/scores/{scoreId}")
	public Score getScore(@PathVariable int scoreId) {
		
		return scoreService.findById(scoreId);
		
	}
	
	
	@PostMapping("/scores")
	public Score addScore(@RequestBody Score score) {
		
		score.setId(0);
		
		scoreService.save(score);
		
		return score;
		
	}
	
	
	@PutMapping("/scores")
	public Score updateScore(@RequestBody Score score) {
		
		scoreService.save(score);
		
		return score;
		
	}
	
	
	@DeleteMapping("/scores/{scoreId}")
	public void deleteScore(@PathVariable int scoreId) {
		
		Score score = scoreService.findById(scoreId);
		
		System.out.println("deleting score :"+score);
		
		scoreService.deleteById(scoreId);
		
	}
	
	
	
	

}
