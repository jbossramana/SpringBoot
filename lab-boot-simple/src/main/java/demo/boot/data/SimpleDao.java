package demo.boot.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class SimpleDao implements ISimpleDao {

	@Autowired
	RestTemplate  restTemplate;
	
	@Override
	public String getMsg() {
		String msg = restTemplate.getForObject("http://localhost:8090", String.class);
		return "Faith"+msg;
	}

}
