package com.doodle.repository;

import com.doodle.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PollRepository extends JpaRepository<Poll, String> {

    @Query("select p from Poll p where p.initiator.email = :email")
    List<Poll> findByUser(@Param("email") String email);

    List<Poll> findAllByTitle(String title);

    List<Poll> findAllByInitiatedAfter(Long date);

}
