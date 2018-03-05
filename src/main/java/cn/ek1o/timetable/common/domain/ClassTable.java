package cn.ek1o.timetable.common.domain;

import java.util.List;

public class ClassTable {
    private List<Subject> subjects;
    private List<Activity> activities;

    @Override
    public String toString() {
        return "ClassTable{" +
                "subjects=" + subjects +
                ", activities=" + activities +
                '}';
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
