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
public class PersonTeste {
	 
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	Person person = new Person();
    	Map<String, Object> map = new HashMap<String, Object>();
    	
    	int opcao = 1;
  
      	do {
    		System.out.println("1 - Inserir um Contato:");
        	System.out.println("2 - Listar Contatos:");
        	System.out.println("3 - Alterar um Contato:");
        	System.out.println("4 - Deletar um Contato");
    		System.out.println("Digite a opção da sua agenta");
        	opcao = scanner.nextInt();
        	
    	if (opcao == 1){
    
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
    	} else if (opcao == 2){
    	
    		List<Person> persons = new PersonDao().findPersons();
            for (Person person1 : persons) {
                System.out.println(person1.toString());
            }
    	}else if (opcao == 3){
 
    		Map<String, Object> map1 = new HashMap<String, Object>();
    		Person person1 = new Person();
            
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
    	}else if (opcao == 4){
    		 
            map.put("_id", scanner.nextLine());
            List<Person> query1 = new PersonDao().findPersons(map);

            for (Person person2 : query1) {
                new PersonDao().delete(person2);
            }
    	}else if (opcao == 5){
    		System.exit(0);
    	}
    	
    	}while (opcao != 0);    
    }
   }
