package com.kavita.basic.model;

import java.util.Date;

public class Project {
	
	private Integer projectId;
	private String projectName;
	private String projectDuration;
	private Date projectCompletionDate;
	
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public void setProjectDuration(String projectDuration) {
		this.projectDuration = projectDuration;
	}
	public void setProjectCompletionDate(Date projectCompletionDate) {
		this.projectCompletionDate = projectCompletionDate;
	}
	@Override
	public String toString() {
		return "projectId :" + projectId + " projectName :" + projectName + " projectDuration :"
				+ projectDuration + " projectCompletionDate :" + projectCompletionDate ;
	}

	
}
