package videoExpress.model;

import java.util.Date;
import java.util.List;

public class Checkout {

	private List<String> moviesAddedToCart;
	private String userId;
	private Date fromDate;
	private Date toDate;
	
	public List<String> getMoviesAddedToCart() {
		return moviesAddedToCart;
	}
	public void setMoviesAddedToCart(List<String> moviesAddedToCart) {
		this.moviesAddedToCart = moviesAddedToCart;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
}
