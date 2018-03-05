package cn.ek1o.timetable.common.domain;

import java.util.List;

public class Subject {
    private String id;
    private String title;
    private String titleAbbr;
    private List<Teacher> teachers;
    private ExamInfo examInfo;

    @Override
    public String toString() {
        return "Subject{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", titleAbbr='" + titleAbbr + '\'' +
                ", teachers=" + teachers +
                ", examInfo=" + examInfo +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleAbbr() {
        return titleAbbr;
    }

    public void setTitleAbbr(String titleAbbr) {
        this.titleAbbr = titleAbbr;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ExamInfo getExamInfo() {
        return examInfo;
    }

    public void setExamInfo(ExamInfo examInfo) {
        this.examInfo = examInfo;
    }
}
