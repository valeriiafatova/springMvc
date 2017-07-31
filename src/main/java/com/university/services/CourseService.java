package com.university.services;

import com.university.entity.Course;

import java.util.List;

/**
 * Created by lerafatova on 26.07.17.
 */
public interface CourseService {
    void addTeam(Course course);
    void updateTeam(Course course);
    Course getTeam(int id);
    void deleteTeam(int id);
    List<Course> getTeams();
}
