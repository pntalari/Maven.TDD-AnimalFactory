package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    Cat catObj = new Cat("Precious", new Date(3), 9);

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setName() {
        //Given
        String expectedName = "Precious";
        //When
        catObj.setName(expectedName);
        //Then
        String actualName = catObj.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        //Given
        String expectedSpeak = "meow!";
        //When
        String actualSpeak = catObj.speak();
        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setDOBTest() {
        //Given
        Date dateExp = new Date(3);
        Date dateAct = new Date();
        //when
        catObj.setBirthDate(new Date(3));
        //Then
        dateAct = catObj.getBirthDate();
        Assert.assertEquals(dateExp, dateAct);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        //Given
        int expectedEaten = catObj.getNumberOfMealsEaten();
        Food food = new Food();
        //When
        catObj.eat(food);
        int actualEaten = catObj.getNumberOfMealsEaten();
        //Then
        expectedEaten = expectedEaten + 1;
        Assert.assertEquals(expectedEaten, actualEaten);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getId() {
        //Given
        int expectedInt = 9;
        //When
        int actualInt = catObj.getId();
        //Then
        Assert.assertEquals(expectedInt, actualInt);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritance() {
        //Given
        boolean actbool = false;
        //When
        actbool = catObj instanceof Animal;
        //Then
        Assert.assertTrue(actbool);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritance() {
        //Given
        boolean actbool = false;
        //When
        actbool = catObj instanceof Mammal;
        //Then
        Assert.assertTrue(actbool);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
