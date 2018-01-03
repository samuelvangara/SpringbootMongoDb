package RaptorCorp.SpringbootMongoDb.Controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import RaptorCorp.SpringbootMongoDb.Pojo.currentPrice;
import RaptorCorp.SpringbootMongoDb.Pojo.myRetailPojo;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/products")
public class myRetailController {

	List<myRetailPojo> mrpList = new ArrayList<myRetailPojo>();
	myRetailPojo mrp1 = new myRetailPojo();
	myRetailPojo mrp2 = new myRetailPojo();
	myRetailPojo mrp3 = new myRetailPojo();
	myRetailPojo mrp4 = new myRetailPojo();
	myRetailPojo mrp5 = new myRetailPojo();
	myRetailPojo mrp6 = new myRetailPojo();
	String result;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getId(@PathVariable String id) {
		final String uri = "http://redsky.target.com/v2/pdp/tcin/13860428?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics";
		RestTemplate restTemplate = new RestTemplate();
		 result = restTemplate.getForObject(uri, String.class);
		mrp1.setiD("15117729");
		mrp1.setName("The Big Lebowski (Blu-ray)(Widescreen)");
		mrp1.setCurrentprice(new currentPrice(13.69, "USA"));
		mrpList.add(mrp1);
		mrp2.setiD("16483589");
		mrp2.setName("The Big Lebowski (Blu-ray)(Widescreen)");
		mrp2.setCurrentprice(new currentPrice(14.69, "USA"));
		mrpList.add(mrp2);
		mrp3.setiD("16696652");
		mrp3.setName("The Big Lebowski (Blu-ray)(Widescreen)");
		mrp3.setCurrentprice(new currentPrice(15.69, "USA"));
		mrpList.add(mrp3);
		mrp4.setiD("16752456");
		mrp4.setName("The Big Lebowski (Blu-ray)(Widescreen)");
		mrp4.setCurrentprice(new currentPrice(15.69, "USA"));
		mrpList.add(mrp4);
		mrp5.setiD("15643793");
		mrp5.setName("The Big Lebowski (Blu-ray)(Widescreen)");
		mrp5.setCurrentprice(new currentPrice(16.69, "USA"));
		mrpList.add(mrp5);
		mrp6.setiD("13860428");
		mrp6.setName("The Big Lebowski (Blu-ray)(Widescreen)");
		mrp6.setCurrentprice(new currentPrice(17.69, "USA"));
		mrpList.add(mrp6);
		if (id.equals(mrp1.getiD())) {
			return mrp1.toString();
		} else if (id.equals(mrp2.getiD())) {
			return mrp2.toString();
		} else if (id.equals(mrp3.getiD())) {
			return mrp3.toString();
		} else if (id.equals(mrp4.getiD())) {
			return mrp4.toString();
		} else if (id.equals(mrp5.getiD())) {
			return mrp5.toString();
		} else if (id.equals(mrp6.getiD())) {
			return mrp6.toString();
		} else {
			return result;
		}
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getAll() {
		final String uri = "http://redsky.target.com/v2/pdp/tcin/13860428?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return result;
	}

	@RequestMapping(value = "/{price}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getPostTest(@PathVariable Double price,@RequestBody myRetailPojo mrp) {
		mrp.setCurrentprice(new currentPrice(price, "USA"));
	   return mrp.toString();
		}
}
