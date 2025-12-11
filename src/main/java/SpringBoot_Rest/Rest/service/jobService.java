package SpringBoot_Rest.Rest.service;

import SpringBoot_Rest.Rest.model.JobPost;
import SpringBoot_Rest.Rest.repo.jobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class jobService {

    @Autowired
    private jobRepo repo;

    public void addJob(JobPost j){
        repo.addJob(j);
    }

    public List<JobPost> getJobPost(){
        return repo.getJobPost();
    }

    public JobPost getjob(int id) {
        return repo.getJob(id);
    }

    public void updateJob(JobPost j) {
        repo.updateJob(j);
    }

    public void deleteJob(int id) {
        repo.deleteJob(id);
    }
}