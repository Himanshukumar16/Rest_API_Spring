package SpringBoot_Rest.Rest.repo;

import SpringBoot_Rest.Rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface jobRepo extends JpaRepository<JobPost,Integer> {
}