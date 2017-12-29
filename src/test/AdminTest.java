package test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hfut.bean.Absense;
import com.hfut.bean.Admin;
import com.hfut.bean.Allowance;
import com.hfut.bean.BasicSalary;
import com.hfut.bean.CheckOff;
import com.hfut.bean.Department;
import com.hfut.bean.Employee;
import com.hfut.bean.Overtime;
import com.hfut.mapper.AdminMapper;
import com.hfut.service.IAdminService;
import com.hfut.service.impl.BaseServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-*.xml")
public class AdminTest extends BaseServiceImpl<Admin> implements IAdminService {
	@org.junit.Test
	public void select() {
		List<BasicSalary> bs=basicSalaryMapper.selectAll();
		for (BasicSalary basicSalary : bs) {
			System.err.println(basicSalary);
		}
				}	
		}
	// @org.junit.Test
// class MybatisUtil {
// private SqlSessionFactory sf = null;
// private static MybatisUtil mu=new MybatisUtil();
//
// private MybatisUtil() {
// try {
// sf = new SqlSessionFactoryBuilder().build(Resources
// .getResourceAsStream("mybatis-config.xml"));
// } catch (Exception e) {
// e.printStackTrace();
// }
// }
// public static SqlSession openSqlSession(){
// return mu.sf.openSession();
// }
// }
