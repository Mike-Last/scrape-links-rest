package scrape;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;

public class LinksServiceTests {
	@Test
	public void testGetLinks() throws IOException {
		String url = "https://google.com";
		
		LinksService linksService = new LinksService();
		
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("test-site.html").getFile());
		Document doc = Jsoup.parse(file,"UTF-8"); 
		
		LinksService linksServiceSpy = Mockito.spy(linksService);
		Mockito.when(linksServiceSpy.connectHelper(url)).thenReturn(doc);
		
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("https://www.link-scraper.com/ (Test)");
		
		assertEquals(linksServiceSpy.getLinks(url),expectedList);
	}

}
