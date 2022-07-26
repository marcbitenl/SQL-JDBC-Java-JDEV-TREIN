import org.junit.Test;

import conexaojdbcc.SingleConnection;

public class TesteBancoJdbc {
	
	
	@Test
	public void initBanco() {
		SingleConnection.getConnection();
	}

}
