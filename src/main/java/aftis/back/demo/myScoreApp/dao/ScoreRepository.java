package aftis.back.demo.myScoreApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aftis.back.demo.myScoreApp.entity.Score;


public interface ScoreRepository extends JpaRepository<Score,Integer> {

}
