package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    Date date = new Date();
    Dog dogObj = new Dog("Pummy", date, 9);


    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        //Given
        Integer givenNum = DogHouse.getNumberOfDogs();
        Integer expectedNum = givenNum + 1;
        //When
        DogHouse.add(dogObj);
        //Then
        Integer actualNum = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedNum, actualNum);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {
        //Given
        DogHouse.add(dogObj);
        Integer expectedNum = DogHouse.getNumberOfDogs();
        //When
        DogHouse.remove(dogObj);
        expectedNum = expectedNum - 1;
        //Then
        Integer actualNum = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedNum, actualNum);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogIdTest() {
        //Given
        DogHouse.clear();
        //When
        DogHouse.remove(9);
        Dog actualDogObj = DogHouse.getDogById(9);
        //Then
        Assert.assertNull(actualDogObj);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {
        //Given
        DogHouse.add(dogObj);
        //When
        Dog actualCatObj = DogHouse.getDogById(9);
        //Then
        Assert.assertNotNull(actualCatObj);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest(){
        //Given
        DogHouse.clear();
        DogHouse.add(dogObj);
        DogHouse.add(dogObj);
        Integer expectedNum = 2;
        //When
        Integer actualNum = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedNum,actualNum);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
