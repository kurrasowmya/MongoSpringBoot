package com.stackroute.MuzixApplicationTask.repository;

import com.stackroute.MuzixApplicationTask.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
//Trackrepository that extends jparepository
@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {
}
