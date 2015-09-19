import geb.Page
import geb.spock.GebSpec
import org.openqa.selenium.firefox.FirefoxDriver
import spock.lang.Specification

public class RedcapUpload extends GebSpec {

    def driver = new FirefoxDriver()

    def "test driver"(){

        setup:
        driver.get("http://www.google.com")

    }

}