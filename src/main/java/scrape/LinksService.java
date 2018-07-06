package scrape;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import scrape.exceptions.BadRequestException;
import scrape.exceptions.InternalServerErrorException;
import scrape.exceptions.NotFoundException;

/**
* Service class for scraping links with Jsoup.
*
* @author  Mike Last
* @version 1.0
* @since   2018/07/06 
*/
public class LinksService {
	public List<String> getLinks(String url){
    	List<String> links = new ArrayList<String>();
		// Attempt to retrieve the web content
		Document doc = connectHelper(url);
		
		// Collect the links
		Elements elementLinks = doc.select("a[href]");
		
		// Iterate through links and add to collection
    	for(Element elementLink : elementLinks) {
    		links.add(elementLink.attr("abs:href") + " (" + elementLink.text() + ")");
    	}
		return links;
    }
    
	protected Document connectHelper(String url) {
    	try {
    		return Jsoup.connect(url).get();
	    } catch (UnknownHostException e) {
			throw new NotFoundException("url = " + url);
		} catch (IllegalArgumentException e) {
			throw new BadRequestException(e.getMessage());
		} catch (IOException e) {
			throw new InternalServerErrorException(e.getMessage());
		}
    }
}
