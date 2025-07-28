Use the application settings API
History 
In GitLab 15.7 and later, you can use the disable_personal_access_tokens attribute in the application settings API to disable personal access tokens.

After you have used the API to disable personal access tokens, those tokens cannot be used in subsequent API calls to manage this setting. To re-enable personal access tokens, you must use the GitLab Rails console. You can also upgrade to GitLab 17.3 or later so you can use the Admin UI instead.


Troubleshooting
Unrevoke a personal access token
Tier: Free, Premium, Ultimate
Offering: GitLab Self-Managed, GitLab Dedicated
If a personal access token is revoked accidentally by any method, administrators can unrevoke that token. By default, a daily job deletes revoked tokens at 1:00 AM system time.