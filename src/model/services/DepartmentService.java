package model.services;

import java.util.List;

import model.dao.DaoFactor;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactor.createDepartmentDao();
	
	public List<Department> findAll() {
		return dao.findAll();
	}

}
