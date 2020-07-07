package com.chanduonline.RatingCourseService.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chanduonline.RatingCourseService.model.Rating;
import com.chanduonline.RatingCourseService.model.StudentRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

	@RequestMapping("/course/{courseId}")
    public Rating getCourseRating(@PathVariable("courseId") String courseId) {
        return new Rating(courseId, 4);
    }

    @RequestMapping("/student/{studentId}")
    public StudentRating getStudentRatings(@PathVariable("studentId") String studentId) {
    	StudentRating studentRating = new StudentRating();
    	studentRating.initData(studentId);
        return studentRating;

    }

}
