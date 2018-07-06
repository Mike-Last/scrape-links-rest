package scrape;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* The LinkScraper application scrapes websites for
* links.  A rest service is provided on port 8080
* and path /links.  Use query param url to specify
* the website (include protocol).
*
* @author  Mike Last
* @version 1.0
* @since   2018/07/06 
*/
@SpringBootApplication
public class LinkScraper {

    public static void main(String[] args) {
        SpringApplication.run(LinkScraper.class, args);
    }
}
