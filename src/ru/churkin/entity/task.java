package ru.churkin.entity;

public class task {

    private String taskName;
    private String userName;
    private String project;
    private String startTime;
    private String endTime;

    public task(String name, String project) {
        this.taskName = name;
        this.project = project;
    }

    public task() {
    }

    public task(String taskName, String project, String startTime, String endTime) {
        this.taskName = taskName;
        this.project = project;
        this.startTime = startTime;
        this.endTime = endTime;
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
}
