package net.viralpatel.spring.persistence.entities;

import java.util.Date;
import java.util.ArrayList;

public class Exercises{
  private String name;
//	private String category;
	private ArrayList<Set> set;
  //Exercises extendar set SKOÐA BETUR
	private int id;

	public Exercises (String name, /*String category,*/ ArrayList<Set> set, int id){
	    this.name=name;
//	    this.category=category;
	    this.set=set; // Skoða betur!!!
	    this.id=id;
	}

	public String getName(){
		return name;
	}
/*
	public String getCategory(){
		return category;
	}
*/
	public ArrayList<Set> getSet(){
		return set;// SKOÐA
	}
	public int getId(){
		return id;
	}
}
