/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mballem.simplemongodb;

/**
 *
 * @author julio
 */
import com.mballem.simplemongodb.dao.PersonDao;

import com.mballem.simplemongodb.entity.Person;

import java.util.*;

import org.bson.types.ObjectId;

/**
 * http://www.mballem.com/
 */
public class PersonTest {
	 
    public static void main(String[] args) {
    	save();
    	//update();
    	//delete();
    	//listar();
    
    
    }

    public static void save() {
    	Scanner scanner = new Scanner(System.in); 
    	Person person = new Person();
        
        
        System.out.println("Primeiro Nome da sua Agenda");
        person.setPrimeiroNome(scanner.nextLine());
    	
        System.out.println("Segundo Nome da sua Agenda");
        person.setSegundoNome(scanner.nextLine());
        
        System.out.println("Idade");
        person.setIdade(scanner.nextLine());
        
        System.out.println("Telefone");
        person.setNumeroTelefone(scanner.nextLine());

        System.out.println("celular");
        person.setNumeroCelular(scanner.nextLine());
      
        new PersonDao().save(person);

    }
    
    public static void listar(){
    	List<Person> persons = new PersonDao().findPersons();
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    public static void update() {
        Map<String, Object> map = new HashMap<String, Object>();
        Scanner scanner = new Scanner(System.in); 
    	Person person = new Person();
        
    	map.put("primeiroNome", scanner.nextLine());
    	Person query = new PersonDao().findPerson(map);
    	
        System.out.println("Primeiro Nome da sua Agenda");
        person.setPrimeiroNome(scanner.nextLine());
    	
        System.out.println("Segundo Nome da sua Agenda");
        person.setSegundoNome(scanner.nextLine());
        
        System.out.println("Idade");
        person.setIdade(scanner.nextLine());
        
        System.out.println("Telefone");
        person.setNumeroTelefone(scanner.nextLine());

        System.out.println("celular");
        person.setNumeroCelular(scanner.nextLine());
       
        new PersonDao().update(query, person);

    }

    public static void delete() {
        Map<String, Object> map = new HashMap<String, Object>();
        
        Scanner scanner = new Scanner(System.in); 
    	 
        map.put("_id", scanner.nextLine());
        List<Person> query = new PersonDao().findPersons(map);

        for (Person person : query) {
            new PersonDao().delete(person);
        }

        List<Person> persons = new PersonDao().findPersons();
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    } 
}
