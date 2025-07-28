Disable personal access tokens for enterprise users
History 
Prerequisites:

You must have the Owner role for the group that the enterprise user belongs to.
Disabling the personal access tokens of a group’s enterprise users:

Stops the enterprise users from creating new personal access tokens. This behavior applies even if an enterprise user is also an administrator of the group.
Disables the existing personal access tokens of the enterprise users.
Disabling personal access tokens for enterprise users does not disable personal access tokens for service accounts.

Clone repository using personal access token
Tier: Free, Premium, Ultimate
Offering: GitLab Self-Managed, GitLab Dedicated
To clone a repository when SSH is disabled, clone it using a personal access token by running the following command: