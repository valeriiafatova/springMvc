package com.university.repository;

import com.university.entity.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lerafatova on 26.07.17.
 */
@Repository
@Transactional
public class CourseDaoImpl extends AbstractJpaDAO<Course> implements CourseDao {
    public CourseDaoImpl() {
        setClazz(Course.class);
    }
}
