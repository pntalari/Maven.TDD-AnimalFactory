package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    Dog dogObj = new Dog("Pummyman",new Date(),3);

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void dogTest(){
        //Given
        String givenName = "Sony";
        Date givenDate = new Date();
        Integer givenId = 9;
        //When
        Dog dog = new Dog(givenName,givenDate,givenId);
        String retrievedName = dog.getName();
        Date retrievedDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();
        //Then
        Assert.assertEquals(givenId,retrievedId);
        Assert.assertEquals(givenName,retrievedName);
        Assert.assertEquals(givenDate,retrievedDate);
    }

    // TODO - Create tests for `speak`
    @Test
    public void dogSpeak(){
        //Given
        String givenspoke = "bark!";
        //When
        String retrievedSpoke = dogObj.speak();
        //Then
        Assert.assertEquals(givenspoke,retrievedSpoke);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest()
    {
        //Given
        Date givenDob = new Date(3);
        //When
        dogObj.setBirthDate(givenDob);
        //Then
        Date retrievedDob = dogObj.getBirthDate();
        Assert.assertEquals(givenDob,retrievedDob);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest()
    {
        //Given
        int givenEaten = dogObj.getNumberOfMealsEaten();
        Food food = new Food();
        //When
        dogObj.eat(food);
        //Then
        givenEaten = givenEaten+1;
        int retrievedEaten = dogObj.getNumberOfMealsEaten();
        Assert.assertEquals(givenEaten,retrievedEaten);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        //Given
        int givenId = 3;
        //When
        int retrievedId = dogObj.getId();
        //Then
        Assert.assertEquals(givenId,retrievedId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
   @Test
    public void animalInheritTest(){
        //Given
        boolean bool = false;
        //When
        bool = dogObj instanceof Animal;
        //Then
        Assert.assertTrue(bool);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritTest(){
        //Given
        boolean bool = false;
        //When
        bool = dogObj instanceof Mammal;
        //Then
        Assert.assertTrue(bool);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
