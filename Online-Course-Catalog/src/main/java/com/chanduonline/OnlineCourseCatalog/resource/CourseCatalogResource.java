package com.chanduonline.OnlineCourseCatalog.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.chanduonline.OnlineCourseCatalog.model.Course;
import com.chanduonline.OnlineCourseCatalog.model.CourseCatalog;
import com.chanduonline.OnlineCourseCatalog.model.StudentRating;

@RestController
@RequestMapping("/courses")
public class CourseCatalogResource {
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	WebClient.Builder webClientBuilder;

	@RequestMapping("/{studentId}")
	public List<CourseCatalog> getCatalog(@PathVariable("studentId") String studentId) {

		StudentRating studentRating = restTemplate.getForObject(
				"http://rating-data-service/ratingsdata/student/" + studentId, StudentRating.class);

		return studentRating.getRatings().stream().map(rating -> {
			Course course = restTemplate.getForObject(
					"http://course-info-service/course/" + rating.getCourseId(), Course.class);
			return new CourseCatalog(course.getName(), "Online Training", rating.getRating());
		}).collect(Collectors.toList());

	}
}

/*
 * Alternative WebClient way Course course = webClientBuilder.build().get().uri(
 * "http://localhost:8082/course-info-service/course/"+ rating.getCourseId())
 * .retrieve().bodyToMono(Course.class).block();
 */
