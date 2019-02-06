package ru.churkin.entity;

public class Task {

    private String taskName;
    private String project;
    private String startTime;
    private String endTime;
    private String userName;

//    public Task(String name, String project) {
//        this.taskName = name;
//        this.project = project;
//    }

    public Task() {
    }

    public Task(String taskName, String project, String startTime, String endTime, String userName) {
        this.taskName = taskName;
        this.project = project;
        this.startTime = startTime;
        this.endTime = endTime;
        this.userName = userName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
