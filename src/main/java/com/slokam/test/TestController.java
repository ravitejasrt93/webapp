package com.slokam.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.slokam.pojo.Person;

@Controller
public class TestController {
  
	@Autowired
	private PersonDao personDao;
	
	@RequestMapping("gotoLogin")
	public  String  gotoLogin(){
		return "login";
	}
	
	@RequestMapping("getData")
	public  String  getData(){
		return "home";
	}
	
	@RequestMapping("saveData")
	public String saveData(Person person ){
		  personDao.save(person);
		  System.out.println(person);
		  return "home";
	}
	@RequestMapping("getAllPersons")
	public ModelAndView getAllPersons(){
		 List<Person> personList =  personDao.findAll();
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("home");
		 mv.addObject("personList",personList);
		 return mv;
	}
	
	@RequestMapping("getPersonById")
	public ModelAndView getPersonById(Integer id){
		  Person person = personDao.findOne(id);
		  ModelAndView mv = new ModelAndView();
		  mv.setViewName("home");
		  mv.addObject("person",person);
		  return mv;
	}
	
	@RequestMapping("updatePerson")
	public ModelAndView updatePerson(Person person){
		  personDao.save(person);
		  ModelAndView mv = new ModelAndView();
		  mv.setViewName("home");
		  mv.addObject("person", new Person());
		  return mv;
	}
	@RequestMapping("deletePerson")
	public ModelAndView deletePerson(Person person){
		  personDao.delete(person);
		  ModelAndView mv = new ModelAndView();
		  mv.setViewName("home");
		  mv.addObject("person", new Person());
		  return mv;
	}
	
}
