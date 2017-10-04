package com.jwt;

import lombok.ToString;

import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

import lombok.Data;

import javax.persistence.Entity;

import javax.persistence.GenerationType;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String username;
	String password;

}
