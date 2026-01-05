package ait.cohort70.post.dao;

import ait.cohort70.post.model.AttachedFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<AttachedFile, Long> {
}
