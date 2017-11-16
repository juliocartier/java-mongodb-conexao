/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mballem.simplemongodb.converter;

/**
 *
 * @author julio
 */
import com.mongodb.DBObject;
import com.mballem.simplemongodb.entity.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * http://www.mballem.com/
 */
public class PersonConverter {

    public Map<String, Object> converterToMap(Person person) {
        Map<String, Object> mapPerson = new HashMap<String, Object>();
        mapPerson.put("primeiroNome", person.getPrimeiroNome());
        mapPerson.put("segundoNome", person.getSegundoNome());
        mapPerson.put("idade", person.getIdade());
        mapPerson.put("numeroTelefone", person.getNumeroTelefone());
        mapPerson.put("numeroCelular", person.getNumeroCelular());

        return mapPerson;
    }

    public Person converterToPerson(DBObject dbo) {
        Person person = new Person();
        person.setId(dbo.get("_id").toString());
        person.setPrimeiroNome((String) dbo.get("primeiroNome"));
        person.setSegundoNome((String) dbo.get("segundoNome"));
        person.setIdade((String) dbo.get("idade"));
        person.setNumeroTelefone((String) dbo.get("numeroTelefone"));
        person.setNumeroCelular((String) dbo.get("numeroCelular"));

        return person;
    }
}
