package com.chanduonline.CourseInfoService.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chanduonline.CourseInfoService.model.Course;

@RestController
@RequestMapping("/course")
public class CourseResource {
	  @RequestMapping("/{courseId}")
	    public Course getCourseInfo(@PathVariable("courseId") String courseId){
	       return  new Course(courseId,"Java Online Training");
	    }
}
