package ait.cohort70.post.dao;

import ait.cohort70.post.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, String> {
}
