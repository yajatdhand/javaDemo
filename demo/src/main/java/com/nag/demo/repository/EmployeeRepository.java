package com.nag.demo.repository;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nag.demo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.ParameterExpression;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Repository
public class EmployeeRepository {

	@Autowired
	EntityManager entityManager;

	public List<Employee> getEmployeeByIdAndName(int id, String name) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class); // Specify the result type

		Root<Employee> employee = cq.from(Employee.class);

//		employee.getJavaType().isass
		final String[] colNames = "name".split(Pattern.quote("."));
		System.out.println("colnames after split " + Arrays.asList(colNames));
		Path<String> ret = employee.get(colNames[0]);
		System.out.println("Hello   " + ret);
		for (int i = 1; i < colNames.length; i++) {
			System.out.println("colNames[" + i + "]" + colNames[i]);
			ret = ret.get(colNames[i]);
		}
		System.out.println("final value of ret " + ret);

		ParameterExpression<? extends String> defaultParam = cb.parameter(ret.getJavaType(), "name");

		System.out.println("defaultParam value " + defaultParam);

		Predicate newWhereClausItem = cb.equal(ret, defaultParam);
		System.out.println("newWhereClausItem " + newWhereClausItem);

		Predicate idPredicate = cb.equal(employee.get("id"), id);
		Predicate namePredicate = cb.equal(employee.get("name"), name);

		cq.where(idPredicate, namePredicate);

		TypedQuery<Employee> query = entityManager.createQuery(cq); // Specify the result type
		return query.getResultList();
	}
}
