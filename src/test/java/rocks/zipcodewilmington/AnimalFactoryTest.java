package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        //Given
        Date date = new Date();
        String givenName = "Sony";
        Date givenDate = date;
        //When
        Dog dogObj = AnimalFactory.createDog("Sony",date);
        String retrievedName = dogObj.getName();
        Date retrieveDate = dogObj.getBirthDate();
        //Then
        Assert.assertEquals(givenName,retrievedName);
        Assert.assertEquals(givenDate,retrieveDate);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        //Given
        Date date = new Date();
        String givenName = "Pony";
        Date givenDate = date;
        //When
        Dog catObj = AnimalFactory.createDog("Pony",date);
        String retrievedName = catObj.getName();
        Date retrieveDate = catObj.getBirthDate();
        //Then
        Assert.assertEquals(givenName,retrievedName);
        Assert.assertEquals(givenDate,retrieveDate);
    }
}

