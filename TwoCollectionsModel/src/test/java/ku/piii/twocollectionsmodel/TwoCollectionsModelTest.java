/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii.twocollectionsmodel;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import ku.piii.model.MusicMedia;
import ku.piii.model.MusicMediaCollection;
import ku.piii.music.MusicService;
import ku.piii.music.MusicServiceFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author James
 */
public class TwoCollectionsModelTest {

    public TwoCollectionsModelTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of haveFirstCollection method, of class TwoCollectionsModel.
     */
    /**
     * Test of swap method, of class TwoCollectionsModel.
     */
    @Test
    public void testMethod() {
        System.out.println("test of my method");
        TwoCollectionsModel testModel = new TwoCollectionsModel();

        String pathA = "../test-music-files/Collection-A";
        String pathB = "../test-music-files/Collection-B";

        testModel.createFirstCollection(pathA);
        testModel.createSecondCollection(pathB);

        MusicMediaCollection firstCollection = testModel.getFirstCollection();
        MusicMediaCollection secondCollection = testModel.getSecondCollection();

        String a = firstCollection.getMusic().get(0).getPath();
        String b = secondCollection.getMusic().get(0).getPath();
        System.out.println("a is " + a);
        System.out.println("b is " + b);

    }

    /**
     * Test of haveFirstCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testHaveFirstCollection() {
        System.out.println("haveFirstCollection");
        TwoCollectionsModel instance = new TwoCollectionsModel();
        boolean expResult = false;
        boolean result = instance.haveFirstCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of haveSecondCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testHaveSecondCollection() {
        System.out.println("haveSecondCollection");
        TwoCollectionsModel instance = new TwoCollectionsModel();
        boolean expResult = false;
        boolean result = instance.haveSecondCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearFirstCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testClearFirstCollection() {
        System.out.println("clearFirstCollection");
        TwoCollectionsModel instance = new TwoCollectionsModel();
        instance.clearFirstCollection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadFirstCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testLoadFirstCollection() {
        System.out.println("loadFirstCollection");
        String collectionFilename = "";
        TwoCollectionsModel instance = new TwoCollectionsModel();
        instance.loadFirstCollection(collectionFilename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createFirstCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testCreateFirstCollection() {
        System.out.println("createFirstCollection");
        String root = "";
        TwoCollectionsModel instance = new TwoCollectionsModel();
        instance.createFirstCollection(root);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveFirstCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testSaveFirstCollection() {
        System.out.println("saveFirstCollection");
        String filename = "";
        TwoCollectionsModel instance = new TwoCollectionsModel();
        instance.saveFirstCollection(filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testGetFirstCollection() {
        System.out.println("getFirstCollection");
        TwoCollectionsModel instance = new TwoCollectionsModel();
        MusicMediaCollection expResult = null;
        MusicMediaCollection result = instance.getFirstCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearSecondCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testClearSecondCollection() {
        System.out.println("clearSecondCollection");
        TwoCollectionsModel instance = new TwoCollectionsModel();
        instance.clearSecondCollection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadSecondCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testLoadSecondCollection() {
        System.out.println("loadSecondCollection");
        String collectionFilename = "";
        TwoCollectionsModel instance = new TwoCollectionsModel();
        instance.loadSecondCollection(collectionFilename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSecondCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testCreateSecondCollection() {
        System.out.println("createSecondCollection");
        String root = "";
        TwoCollectionsModel instance = new TwoCollectionsModel();
        instance.createSecondCollection(root);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveSecondCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testSaveSecondCollection() {
        System.out.println("saveSecondCollection");
        String filename = "";
        TwoCollectionsModel instance = new TwoCollectionsModel();
        instance.saveSecondCollection(filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecondCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testGetSecondCollection() {
        System.out.println("getSecondCollection");
        TwoCollectionsModel instance = new TwoCollectionsModel();
        MusicMediaCollection expResult = null;
        MusicMediaCollection result = instance.getSecondCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testSetFirstCollection() {
        System.out.println("setFirstCollection");
        List<MusicMedia> thisList = null;
        TwoCollectionsModel instance = new TwoCollectionsModel();
        instance.setFirstCollection(thisList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecondCollection method, of class TwoCollectionsModel.
     */
    @Test
    public void testSetSecondCollection() {
        System.out.println("setSecondCollection");
        List<MusicMedia> thisList = null;
        TwoCollectionsModel instance = new TwoCollectionsModel();
        instance.setSecondCollection(thisList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of swap method, of class TwoCollectionsModel.
     */
    @Test
    public void testSwap() {
        System.out.println("Test 1");
        TwoCollectionsModel collections = new TwoCollectionsModel();
        collections.createFirstCollection("../test-music-files/collection-A/DARKPOP BAND ANGELIQUE - PERFECT WORLD (AMBIENT) - clip.mp3");
        collections.createSecondCollection("../test-music-files/collection-B/Wortrausch - Sommerzeit (Doppelzeit) - (Live) - clip.mp3");
        collections.loadFirstCollection("test-music-files/collection-A");
        collections.loadSecondCollection("test-music-files/collection-B");
        System.out.println(collections.getFirstCollection());
        System.out.println(collections.getSecondCollection());
        collections.swap();
        System.out.println(collections.getFirstCollection());
        System.out.println(collections.getSecondCollection());
    }

}
