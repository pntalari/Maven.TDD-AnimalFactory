package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    Date date = new Date();
    Cat catObj = new Cat("Pony", date, 9);

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        //Given
        Integer givenNum = CatHouse.getNumberOfCats();
        Integer expectedNum = givenNum + 1;
        //When
        CatHouse.add(catObj);
        //Then
        Integer actualNum = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedNum, actualNum);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        //Given
        CatHouse.add(catObj);
        Integer expectedNum = CatHouse.getNumberOfCats();
        //When
        CatHouse.remove(catObj);
        expectedNum = expectedNum - 1;
        //Then
        Integer actualNum = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedNum, actualNum);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatIdTest() {
        //Given
        //When
        CatHouse.remove(9);
        Cat actualCatObj = CatHouse.getCatById(9);
        //Then
        Assert.assertNull(actualCatObj);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        //Given
        CatHouse.add(catObj);
        //When
        Cat actualCatObj = CatHouse.getCatById(9);
        //Then
        Assert.assertNotNull(actualCatObj);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        //Given
        CatHouse.add(catObj);
        CatHouse.add(catObj);
        Integer expectedNum = 2;
        //When

        Integer actualNum = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedNum,actualNum);
    }

}
