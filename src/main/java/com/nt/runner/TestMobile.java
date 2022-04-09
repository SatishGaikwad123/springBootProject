package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Company;
import com.nt.model.Mobile;
import com.nt.repositry.MobileRepo;
@Component
public class TestMobile  implements CommandLineRunner{

	@Autowired
	private MobileRepo mrepo1;
	@Autowired
	  private MobileRepo mrepo;
	@Override
	public void run(String... args) throws Exception {
		
		Mobile mob = new Mobile();
		mob.setMNumber(1122);
		mob.setMName("note 8");
		
		mob.setCompanyList(Arrays.asList(new Company(10001)));
		
		mrepo.save(mob);
	}

}
