package com.code.ahmad.JsonPractice;

import java.io.File;

import com.code.ahmad.JsonPractice.Entity.MainEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to jackson");

		// Creating object mapper
		ObjectMapper mapper = new ObjectMapper();
		try {
			// Reading values using object mapper from file
			MainEntity main = mapper.readValue(new File("data/jsonFile.json"), MainEntity.class);

			System.out.println("Name of the City: " + main.getName());

			System.out.println("Id is: " + main.getId());

			System.out.println("TmeZone is: " + main.getTimezone());

			System.out.println("Cod is: " + main.getCod());

			System.out.println("Coord is: " + main.getCoord());

			System.out.println("Weather is: " + main.getWeather());

			System.out.println("Base is: " + main.getBase());

			System.out.println("Main is: " + main.getMain());

			System.out.println("Viibility is: " + main.getVisibility());

			System.out.println("Wind is: " + main.getWind());

			System.out.println("Clouds are: " + main.getClouds());

			System.out.println("dt: " + main.getDt());

			System.out.println("Sys is:" + main.getSys());

		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}
}
