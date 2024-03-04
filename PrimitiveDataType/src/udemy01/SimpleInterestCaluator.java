package udemy01;

import java.math.BigDecimal;

public class SimpleInterestCaluator {
	BigDecimal  principal;
	BigDecimal  interest;
	
	public SimpleInterestCaluator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);
	}
	
	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal totalValue = principal.add(
				principal.multiply(interest.divide(new BigDecimal(100)))
				.multiply(new BigDecimal(noOfYears)));
		return totalValue;
	}
	
	
}
