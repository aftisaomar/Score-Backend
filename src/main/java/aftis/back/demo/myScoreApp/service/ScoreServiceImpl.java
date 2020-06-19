package aftis.back.demo.myScoreApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aftis.back.demo.myScoreApp.dao.ScoreRepository;
import aftis.back.demo.myScoreApp.entity.Score;
import aftis.back.demo.myScoreApp.exception.ScoreException;

@Service
public class ScoreServiceImpl implements ScoreService {
	
	ScoreRepository scoreRepository;
	
	@Autowired
	 public ScoreServiceImpl(ScoreRepository scoreRepository) {
		
		this.scoreRepository = scoreRepository;
		
	}
	

	@Override
	public List<Score> findAll() {
		return scoreRepository.findAll();
	}

	@Override
	public Score findById(int id) {
		
		Optional<Score> optional = scoreRepository.findById(id);
		
		
		if(optional.isPresent()) {
			
			return optional.get();
		}else {
				
			throw new ScoreException("error Score with id : "+id+" not exist");
		}
		
		
	}

	@Override
	public void save(Score score) {
		
		scoreRepository.save(score);
	}

	@Override
	public void deleteById(int id) {
		
		scoreRepository.deleteById(id);

	}

}
