package com.university.web.controller;

import com.university.entity.Course;
import com.university.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by lerafatova on 26.07.17.
 */
@Controller
@RequestMapping(value = "/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/add")
    public ModelAndView addTeamPage(){
        ModelAndView modelAndView = new ModelAndView("add-course-form");
        modelAndView.addObject("course", new Course());
        return modelAndView;
    }

    @RequestMapping(value = "/add/process")
    public ModelAndView addingTeam(@ModelAttribute Course course){
        ModelAndView modelAndView = new ModelAndView("home");
        courseService.addTeam(course);

        String message = "Course was successfully added.";
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    @RequestMapping(value = "/list")
    public ModelAndView listOfTeams(){
        ModelAndView modelAndView = new ModelAndView("list-of-courses");
        List<Course> cources = courseService.getTeams();
        modelAndView.addObject("courses", cources);

        return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editTeamPage(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("edit-course-form");
        Course course = courseService.getTeam(id);
        modelAndView.addObject("course", course);

        return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public ModelAndView editingTeam(@ModelAttribute Course course, @PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("home");
        courseService.updateTeam(course);

        String message = "Course was successfully edited.";
        modelAndView.addObject("message", message);

        return modelAndView;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteTeam(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("home");
        courseService.deleteTeam(id);
        String message = "Course was successfully deleted.";

        modelAndView.addObject("message", message);
        return modelAndView;
    }


}
