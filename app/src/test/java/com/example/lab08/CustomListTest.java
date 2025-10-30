package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        
        // This will fail initially because hasCity() doesn't exist yet
        assertTrue(list.hasCity(edmonton));
        
        City calgary = new City("Calgary", "AB");
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");
        
        list.addCity(edmonton);
        list.addCity(calgary);
        
        // Verify city is in the list
        assertTrue(list.hasCity(edmonton));
        
        // Delete the city
        list.deleteCity(edmonton);
        
        // Verify city is no longer in the list
        assertFalse(list.hasCity(edmonton));
        
        // Verify other city is still there
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        
        // Initially, list should be empty
        assertEquals(0, list.countCities());
        
        // Add first city
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        assertEquals(1, list.countCities());
        
        // Add second city
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertEquals(2, list.countCities());
        
        // Add third city
        City vancouver = new City("Vancouver", "BC");
        list.addCity(vancouver);
        assertEquals(3, list.countCities());
        
        // Delete a city
        list.deleteCity(calgary);
        assertEquals(2, list.countCities());
    }
}
