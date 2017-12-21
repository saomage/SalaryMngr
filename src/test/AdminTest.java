package test;

import java.util.ArrayList ;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-*.xml")
public class AdminTest {
	
	@org.junit.Test
	public void select(){
		Boolean b = false ;
		System.out.println(b);
	}
	//@org.junit.Test	
}
