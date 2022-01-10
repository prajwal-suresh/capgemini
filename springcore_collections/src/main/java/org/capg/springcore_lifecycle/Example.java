package org.capg.springcore_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	// method LifeCycle
	@PostConstruct
	public void start() {
		System.out.println("Start method");
	}
	@PreDestroy
	public void end() {
		System.out.println("Destroy the method");
	}

}
