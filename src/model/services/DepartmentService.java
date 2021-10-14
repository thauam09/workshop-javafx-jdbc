package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	private DepartmentDao dao = DaoFactory.createDepartmentDao();

	public List<Department> findAll() {
		List<Department> list = dao.findAll();
		return list;
	}

	public void SaveOrUpdate(Department obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		} else {
			dao.update(obj);
		}
	}

	public void Remove(Department obj) {
		dao.deleteById(obj.getId());
	}
}
