/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mballem.simplemongodb.entity;

/**
 *
 * @author julio
 */
import java.io.Serializable;

/**
 * http://www.mballem.com/
 */
public class Person implements Serializable {
    public String id;
    public String primeiroNome;
    public String segundoNome;
    public String idade;
    public String numeroTelefone;
    public String numeroCelular;

    public Person() {
        super();
    }

    public Person(String primeiroNome, String segundoNome, String idade, String numeroTelefone, String numeroCelular) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.idade = idade;
        this.numeroTelefone = numeroTelefone;
        this.numeroCelular = numeroCelular;
    }

    //Gere os metodos get/set

    
    public String toString() {
        return "Person{" +
                "_id='" + id + '\'' +
                ", primeiroNome='" + primeiroNome + '\'' +
                ", segundoNome='" + segundoNome + '\'' +
                ", idade=" + idade + '\'' +
                ", numeroTelefone=" + numeroTelefone + '\'' +
                ", numeroCelular =" + numeroCelular + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id){
    	this.id = id;
    }

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
   
    
}