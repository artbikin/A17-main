package pageObjectTests;

import com.github.javafaker.Faker;
import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTest extends BaseTest{

    @Test
    public void createPlaylist(){
//        String playlistName = TestDataGenerator.randomString(8);
        Faker faker = new Faker();
        String playlistName = faker.artist().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.playlistExist(playlistId,playlistName));
    }
    @Test
    public void renamePlaylist(){
        Faker faker = new Faker();
        String playlistName = faker.artist().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.funnyName().name();
        mainPage.renamePlaylist(playlistId,newName);
        Assert.assertTrue(mainPage.playlistExist(playlistId,newName));
    }
    @Test
    public void createPlaylist1(){
//        String playlistName = TestDataGenerator.randomString(8);
        Faker faker = new Faker();
        String playlistName = faker.artist().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.playlistExist(playlistId,playlistName));
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void renamePlaylist1(){
        Faker faker = new Faker();
        String playlistName = faker.artist().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.funnyName().name();
        mainPage.renamePlaylist(playlistId,newName);
        Assert.assertTrue(mainPage.playlistExist(playlistId,newName));
    }
    @Test
    public void createPlaylist2(){
//        String playlistName = TestDataGenerator.randomString(8);
        Faker faker = new Faker();
        String playlistName = faker.artist().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.playlistExist(playlistId,playlistName));
    }
    @Test
    public void renamePlaylist2(){
        Faker faker = new Faker();
        String playlistName = faker.artist().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.funnyName().name();
        mainPage.renamePlaylist(playlistId,newName);
        Assert.assertTrue(mainPage.playlistExist(playlistId,newName));
    }
    @Test
    public void createPlaylist3(){
//        String playlistName = TestDataGenerator.randomString(8);
        Faker faker = new Faker();
        String playlistName = faker.artist().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.playlistExist(playlistId,playlistName));
    }
    @Test
    public void renamePlaylist3(){
        Faker faker = new Faker();
        String playlistName = faker.artist().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.funnyName().name();
        mainPage.renamePlaylist(playlistId,newName);
        Assert.assertTrue(mainPage.playlistExist(playlistId,newName));
    }
}
