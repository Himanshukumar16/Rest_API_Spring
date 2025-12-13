package SpringBoot_Rest.Rest.controller;

import SpringBoot_Rest.Rest.model.JobPost;
import SpringBoot_Rest.Rest.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class jobController {

    @Autowired
    private jobService js ;

    @GetMapping("jobposts")
    public List<JobPost> getJobs() {
        return js.getJobPost();
    }

    @GetMapping("jobpost/{id}")
    public JobPost getJob(@PathVariable("id") int id){
        return js.getjob(id);
    }

    @PostMapping("jobpost")
    public void addJob(@RequestBody JobPost j) {
        js.addJob(j);
    }

    @PutMapping("jobpost")
    public void updateJob(@RequestBody JobPost j) {
        js.updateJob(j);
    }

    @DeleteMapping("jobpost/{id}")
    public String deleteJob(@PathVariable int id) {
        js.deleteJob(id);
        return "Deleted";
    }

    @GetMapping("load")
    public String loadJob(){
        js.load();
        return "Loaded !";
    }
}
