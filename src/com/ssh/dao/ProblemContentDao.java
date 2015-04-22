package com.ssh.dao;

import java.util.List;

import com.ssh.model.ProblemContent;

public interface ProblemContentDao {
	public void save(ProblemContent a);
	
	public void delete(int id);
	
	public List<ProblemContent> getProblemsByType();
	
	public ProblemContent getProblem(int id);
}
