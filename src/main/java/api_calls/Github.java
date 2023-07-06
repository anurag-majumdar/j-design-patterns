package api_calls;

import api_calls.models.Contributor;
import api_calls.models.Issue;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface Github {
    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@Param("owner") String owner, @Param("repo") String repo);

    @RequestLine("POST /repos/{owner}/{repo}/issues")
    void createIssue(Issue issue, @Param("owner") String owner, @Param("repo") String repo);
}
