package RaptorCorp.SpringbootMongoDb.Pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;

@Component
@Document(collection="myretails")
public class myRetailPojo {
	@Id
	private String iD;
	private String name;
	private currentPrice currentprice;

	/**
	 * @return the iD
	 */
	public String getiD() {
		return iD;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setiD(String iD) {
		this.iD = iD;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}	
	/**
	 * @return the currentprice
	 */
	public currentPrice getCurrentprice() {
		return currentprice;
	}

	/**
	 * @param currentprice the currentprice to set
	 */
	public void setCurrentprice(currentPrice currentprice) {
		this.currentprice = currentprice;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		try {
			 return new com.fasterxml.jackson.databind.ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this);
		} catch (JsonProcessingException e) {
		}
		return null;
	}
}
