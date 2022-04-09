package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Company;
import com.nt.repositry.CompanyRepo;
//@Component
public class TestCompany implements CommandLineRunner{

	@Autowired
	private CompanyRepo crepo;
	@Override
	public void run(String... args) throws Exception {
	
		  Company con = new Company();
		  con.setCId(10001);
		  con.setCName("IPhone");
		  con.setCAdd("Hydrabad");
		  
		  crepo.save(con);
		  
		  Company con1 = new Company();
		  con1.setCId(10002);
		  con1.setCName("Redmi");
		  con1.setCAdd("Mumbai");
		  
		  crepo.save(con1);
		  
		  Company con2 = new Company();
		  con2.setCId(10003);
		  con2.setCName("Micromax");
		  con2.setCAdd("Pune");
		  
		  crepo.save(con2);
		  
		  Company con3 = new Company();
		  con3.setCId(10004);
		  con3.setCName("MI");
		  con3.setCAdd("Ahmednagar");
		  
		  crepo.save(con3);
		  
		  Company con4 = new Company();
		  con4.setCId(10005);
		  con4.setCName("Samsang");
		  con4.setCAdd("Kolpewadi");
		  
		  crepo.save(con4);
		  
		  
		
	}

}
