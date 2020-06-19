package aftis.back.demo.myScoreApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="score")
public class Score {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="points")
	private int points;
	
	
	
	public Score() {
		
		
	}



	public Score(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPoints() {
		return points;
	}



	public void setPoints(int points) {
		this.points = points;
	}



	@Override
	public String toString() {
		return "Score [id=" + id + ", name=" + name + ", points=" + points + "]";
	}
	
	
	
	

}
