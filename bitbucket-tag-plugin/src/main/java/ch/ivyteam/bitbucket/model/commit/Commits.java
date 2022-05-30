package ch.ivyteam.bitbucket.model.commit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ch.ivyteam.bitbucket.model.paged.PagedResult;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Commits extends PagedResult<Commit>
{
}