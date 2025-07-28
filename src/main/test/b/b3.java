Use the application settings API
History 
In GitLab 15.7 and later, you can use the disable_personal_access_tokens attribute in the application settings API to disable personal access tokens.

After you have used the API to disable personal access tokens, those tokens cannot be used in subsequent API calls to manage this setting. To re-enable personal access tokens, you must use the GitLab Rails console. You can also upgrade to GitLab 17.3 or later so you can use the Admin UI instead.

Change the syntax highlighting theme
History 
Syntax highlighting is a feature in code editors and IDEs. The highlighter assigns a color to each type of code, such as strings and comments.