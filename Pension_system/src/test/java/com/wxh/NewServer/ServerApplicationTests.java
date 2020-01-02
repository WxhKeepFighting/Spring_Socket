package com.wxh.NewServer;

import com.wxh.NewServer.DAO.MissionRepository;
import com.wxh.NewServer.DAO.ServiceRepository;
import com.wxh.NewServer.Entity.Mission;
import com.wxh.NewServer.Entity.Service;
import com.wxh.NewServer.Exception.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.security.RunAs;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
class ServerApplicationTests {

	@Autowired
	private MissionRepository repository;
	@Autowired
	private ServiceRepository serviceRepository;

	@Before
	void init(){}

	@After
	void deleteAll(){

	}

	@Test
	void testQuery1() {
		Mission byStatusAndMid = repository.findByStatusAndVid("1", "1");
		System.out.println(byStatusAndMid);
	}

	@Test
	void testQuery2(){
		Service byMid =serviceRepository.findByMid("123");
		System.out.println(byMid);
	}

	@Test
	void testStartService(){

	}

	@Test
	void testEndService(){
		AjaxResponse response = AjaxResponse.success();
		List<AjaxResponse> list = new ArrayList<>();
		list.add(response);
		System.out.println(list);
	}


}
