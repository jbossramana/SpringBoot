package demo.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.boot.data.ISimpleDao;

@Service
public class SimpleService implements ISimpleService {

	@Autowired
	ISimpleDao  simpleDao;
	
	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return "Unshakable"+simpleDao.getMsg();
	}

}
