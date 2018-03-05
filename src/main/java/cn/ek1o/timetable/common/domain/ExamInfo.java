package cn.ek1o.timetable.common.domain;

import java.util.Date;

public class ExamInfo {
    private String title;
    private String content;
    private String location;
    private Date startTime;
    private Date endTime;

    public ExamInfo() {}

    @Override
    public String toString() {
        return "ExamInfo{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", location='" + location + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
