package com.university.services;

import com.university.entity.Course;
import com.university.repository.AbstractJpaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lerafatova on 26.07.17.
 */
@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    private AbstractJpaDAO<Course> teamDao;

    @Override
    public void addTeam(Course course) {
        teamDao.create(course);
    }

    @Override
    public void updateTeam(Course course) {
        teamDao.update(course);
    }

    @Override
    public Course getTeam(int id) {
        return teamDao.findOne(id);
    }

    @Override
    public void deleteTeam(int id) {
        teamDao.deleteById(id);
    }

    @Override
    public List<Course> getTeams() {
        return teamDao.findAll();
    }
}
