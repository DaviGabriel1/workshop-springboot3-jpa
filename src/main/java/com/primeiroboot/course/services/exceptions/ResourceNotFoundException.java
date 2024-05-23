package com.primeiroboot.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{ //runtimeException é uma exceção que não precisa ser tratada

	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}
}
