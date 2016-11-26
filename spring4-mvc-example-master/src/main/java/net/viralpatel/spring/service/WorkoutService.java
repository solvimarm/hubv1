package net.viralpatel.spring.service;

import java.util.ArrayList;
import net.viralpatel.spring.persistence.entities.Day;
import net.viralpatel.spring.persistence.entities.User;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import net.viralpatel.spring.persistence.entities.Exercises;
import net.viralpatel.spring.persistence.entities.Set;

import net.viralpatel.spring.persistence.repositories.UserRepository;
import net.viralpatel.spring.persistence.repositories.WorkoutRepository;

public class WorkoutService{

	public UserRepository userRepository = new UserRepository();
	public WorkoutRepository workoutRepository = new WorkoutRepository();

	public void createNewCycle(User user){

		//String to Date
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String nextUpdate = user.getNextUpdate();
		Date nextUpdateDate;
		try{
			nextUpdateDate = dateFormat.parse(nextUpdate);

			Calendar c = Calendar.getInstance();
			c.setTime(new Date()); // Now use today date.
			c.add(Calendar.DATE, 1); // Adding 1 day
			Date date = c.getTime();
			String toomorrow = dateFormat.format(date);
			//Date currDateFormat = dateFormat.parse(currentDate);
			if(date.compareTo(nextUpdateDate) >= 0) {
				workoutRepository.createCycle(user.getUsername(), toomorrow);
			}

		}catch(Exception e){
			System.out.println("þú ert inní exception auli");
		}	
	}

	public void updateDay(Day day,String username){
		ArrayList<Exercises> exercises = day.getExercises();
		for(int i=0; i<exercises.size(); i++){
			Exercises exercise = exercises.get(i);
			ArrayList<Set> sets = exercise.getSet();
			for(int j=0; j<sets.size();j++){
				Set set = sets.get(j);
				workoutRepository.updateSet(username, set.getWeight(), set.getNumber(), exercise.getId(), day.getDate());
			}
		}
		
		workoutRepository.wentToGym(username, day.getDate());

	}

	public ArrayList<Day> getCurrentCycle(String username){

		Object currentCycleObject = workoutRepository.getCurrentCycle(username);
		
		if(currentCycleObject instanceof ArrayList<?>){
			ArrayList<Day> currentCycle = (ArrayList<Day>) currentCycleObject;
			ArrayList<Exercises> exer = currentCycle.get(0).getExercises();
			System.out.println(currentCycle.get(0).getWentToGym());
			System.out.println(exer.get(0).getName());
			return currentCycle;
		}
		return null;
	}
	public Day getSpecificDay(String username, String date){
		
		Object dayObject = workoutRepository.getSpecificDay(username, date);

		if(dayObject instanceof Day){
			Day day = (Day) dayObject;
			return day;
		}
		return null;
	}

	public String getWeekday(String date){

		SimpleDateFormat simpleDateformat1 = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat simpleDateformat2 = new SimpleDateFormat("EEEE");
		Date day;
		String weekday;
		try{
			day = simpleDateformat1.parse(date);
			weekday = simpleDateformat2.format(day);
			return weekday;

		}catch(Exception e){
			System.out.println("þú ert inní exception auli");
			return null;
		}
	}

	public int getIdByDate(String username,String date){
		return Integer.valueOf((String)workoutRepository.getIdfromDate(username,date));
	}


}