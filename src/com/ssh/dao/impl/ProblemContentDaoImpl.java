package com.ssh.dao.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ssh.dao.ProblemContentDao;
import com.ssh.hibernate.HibernateUtil;
import com.ssh.model.ProblemComment;
import com.ssh.model.ProblemContent;

public class ProblemContentDaoImpl implements ProblemContentDao {

	private static final ProblemContentDaoImpl instance = new ProblemContentDaoImpl();
    
	  public static ProblemContentDaoImpl getInstance() {
	    return instance;
	  }
	    
	  private ProblemContentDaoImpl() {
	    
	  } 
	
    public ProblemContent createProblem(int problemLevel,
    				 		  int problemType,
    				 		  int uploadProblemUserID,
    				 		  String problemContent,
    				 		  String problemFrom,
    				 		  String  problemKnowledgePoint,
    				 		  String problemLanguage,
    				 		  String problemSolutionWay) {
    	ProblemContent problem = new ProblemContent();
    	problem.setProblemContent(problemContent);
    	problem.setProblemLevel(problemLevel);
    	problem.setProblemType(problemType);
    	problem.setUploadProblemUserID(uploadProblemUserID);
    	problem.setProblemFrom(problemFrom);
    	problem.setProblemKnowledgePoint(problemKnowledgePoint);
    	problem.setProblemLanguage(problemLanguage);
    	problem.setProblemSolutionWay(problemSolutionWay);
    	problem.setProblemScore(0);
    	return problem;
    }
	  
	public void save(ProblemContent a) {
		HibernateUtil.save(a);
	}
	
	public void addProblemComment(ProblemComment comment, int problemID) {
//		ProblemContent problem = (ProblemContent) HibernateUtil.getObject(ProblemContent.class, problemID);
//		problem.getCommentList().add(comment);
//		HibernateUtil.save(problem);
	}

	public void delete(int id) {
		
		// TODO Auto-generated method stub
		
	}

	public List<ProblemContent> getProblemsByType() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProblemContent getProblem(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
