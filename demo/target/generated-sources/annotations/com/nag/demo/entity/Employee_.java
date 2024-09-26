package com.nag.demo.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static volatile SingularAttribute<Employee, String> name;
	public static volatile SingularAttribute<Employee, Integer> rollNo;
	public static volatile SingularAttribute<Employee, Integer> id;

	public static final String NAME = "name";
	public static final String ROLL_NO = "rollNo";
	public static final String ID = "id";

}

