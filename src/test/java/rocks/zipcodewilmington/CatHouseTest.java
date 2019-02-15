package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    private Cat catObj;
    @Before
            public void setup(){
        CatHouse.clear(); // avoids concurrency issues
        catObj = new Cat(null, null, 0);
    }

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        //Given
        Integer givenNum = CatHouse.getNumberOfCats();
        Integer id = catObj.getId();
        Integer expectedNum = givenNum + 1;
        //When
        CatHouse.add(catObj);
        Cat actualCat = CatHouse.getCatById(id);
        //Then
        Integer actualNum = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedNum, actualNum);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        //Given
        int id = 10;
        Cat catToBeAdded = new Cat(null,null,id);
        CatHouse.add(catToBeAdded);
        //Integer Id = catToBeAdded.getId();
        //When
        CatHouse.remove(catToBeAdded);
        Cat removedCat = CatHouse.getCatById(id);
        //Then
        //Integer actualNum = CatHouse.getNumberOfCats();
        Assert.assertNull(removedCat);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatIdTest() {
        //Given
        int id = 9;
        //When
        CatHouse.remove(id);
        Cat actualCatObj = CatHouse.getCatById(id);
        //Then
        Assert.assertNull(actualCatObj);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        //Given
        CatHouse.clear();
        CatHouse.add(catObj);
        CatHouse.add(catObj);
        Integer catAddedBefore = CatHouse.getNumberOfCats();
        //When
        CatHouse.add(catObj);
        Integer expectedNum = catAddedBefore + 1;
        Integer actualNum = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedNum,actualNum);
    }
}
