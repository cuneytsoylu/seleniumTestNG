package tests.day16;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
public class C01_DriverIlkTest {
    // driver class'i sayesinde eski driver kulanilmiyor.
    // artık driver'e ihtiyac varsa Driver.getDriver() yazacagiz
    @Test
    public void test01() {
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //amazona gittigimizi test edelim
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));
        // Driver.getDriver methodu her calistigibda
        // driver=new ChromeDriver(); komutundan oturu yeni bir driver olusturuyor
        // Biz Driver Class'ini ilk calistirdigimizda new atamasi olsun
        // sonraki calistirmalarda atama olmasin istiyoruz
        // bunun icin driver=new ChromeDriver(); satiri if blogu icine alacagiz
        Driver.closeDriver();
    }
    @Test
    public void test02(){
        //bestbuy anasayfaya gidelim
        Driver.getDriver().get("https://bestbuy.com");
        //bestbuy'a gittigimizi test edelim'
        String actualurl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualurl.contains("bestbuy"));
        Driver.closeDriver();
    }
}