package it.objectmethod.RestTutorial.resourceassembler;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import it.objectmethod.RestTutorial.controller.EmployeeController;
import it.objectmethod.RestTutorial.model.Employee;

@Component
public class EmployeeResourceAssembler 
implements ResourceAssembler<Employee, Resource<Employee>>{

	@Override
	public Resource<Employee> toResource(Employee employee) {
		return new Resource<>(employee,
				linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
				linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
	}

}
