1.forward:
-it redirect to another @controller handler method but keep the request URL as same.
-request body  will be same.
2.redirect
-it redirect to another @controller handler method after closing current request and creating new web request.
-so request URL will be changed to new one
-as new web request is created so,previous request body is not saved.