1. create property placeholder bean
    * <context:property-placeholder location="my-app.properties"/>
2. use  <context:annotation-config/> to enable usage of  @value annotation
3. use  @value("${key}") at field level in java class