package scrape;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* Controller class for path /links.
*
* @author  Mike Last
* @version 1.0
* @since   2018/07/06 
*/
@RestController
public class LinksController {

	LinksService linksService = new LinksService();
	
    @GetMapping("/links")
    public List<String> links(@RequestParam(value="url", defaultValue="https://google.com") String url) {
        return linksService.getLinks(url);
    }
}