package com.hfut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hfut.service.IAbsenseService;
import com.hfut.service.IAdminService;
import com.hfut.service.IAllowanceService;
import com.hfut.service.IBasicSalaryService;
import com.hfut.service.ICheckOffService;
import com.hfut.service.IDepartmentService;
import com.hfut.service.IEmployeeService;
import com.hfut.service.IOvertimeService;

@Controller
public class BaseController {
	@Autowired
	protected IAbsenseService absenseService;
	@Autowired
	protected IAdminService adminService;
	@Autowired
	protected IAllowanceService allowanceService;
	@Autowired
	protected IBasicSalaryService basicSalaryService;
	@Autowired
	protected ICheckOffService checkOffService;
	@Autowired
	protected IDepartmentService departmentService;
	@Autowired
	protected IEmployeeService employeeService;
	@Autowired
	protected IOvertimeService overtimeService;
}
