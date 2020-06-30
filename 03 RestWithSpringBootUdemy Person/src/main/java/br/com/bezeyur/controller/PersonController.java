package br.com.bezeyur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bezeyur.model.Person;
import br.com.bezeyur.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService services;
	
	@RequestMapping(method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findAll() {
		return services.findAll();	
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public Person findById(@PathVariable("id") String id) {
		return services.findById(id);	
	}
	
	@RequestMapping(method=RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Person create(@RequestBody Person person) {
		return services.create(person);	
	}

	@RequestMapping(method=RequestMethod.PUT, produces= MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Person update(@RequestBody Person person) {
		return services.create(person);	
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE, produces= MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable("id") String id) {
		services.delete(id);	
	}
}
