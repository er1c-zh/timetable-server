package cn.ek1o.timetable.common.domain;

import cn.ek1o.timetable.common.e.ActivityCreator;

public class Activity {
    private Subject subject;
    private ActivityCreator creator;
    private String week2show;

    {
        creator = ActivityCreator.SYSTEM;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "subject=" + subject +
                ", creator=" + creator +
                '}';
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ActivityCreator getCreator() {
        return creator;
    }

    public void setCreator(ActivityCreator creator) {
        this.creator = creator;
    }

    public String getWeek2show() {
        return week2show;
    }

    public void setWeek2show(String week2show) {
        this.week2show = week2show;
    }
}
