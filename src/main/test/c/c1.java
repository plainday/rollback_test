Personal access token expiry emails
History 
GitLab runs a check every day at 1:00 AM UTC to identify personal access tokens that are expiring in the near future. The owners of these tokens are notified by email when these tokens expire in a certain number of days. The number of days differs depending on the version of GitLab:

Alternatives to personal access tokens
For Git over HTTPS, an alternative to personal access tokens is to use an OAuth credential helper.