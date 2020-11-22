package com.matt.subscriberList.subscriber;

import org.springframework.data.repository.CrudRepository;

import com.matt.subscriberList.quiz.Quiz;

public interface QuizRepository extends CrudRepository<Quiz, Long> {

	static void save(com.matt.subscriberList.subscriber.Quiz quiz) {
		// TODO Auto-generated method stub

	}

}
