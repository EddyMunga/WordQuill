package com.eddy.wordquill.repository;

import com.eddy.wordquill.models.Quill;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuillsRepository extends MongoRepository<Quill, String> {

}
