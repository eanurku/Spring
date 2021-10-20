1.Upgrade to spring 4.x
2. add below versions:
-spring-webmvc :4.0.3.RELEASE
-spring-oxm :4.0.3.RELEASE
3. after changing spring-oxm to 4.0.3.RELEASE  below error thrown during UI loading :
`java.lang.ClassNotFoundException: com.thoughtworks.xstream.io.naming.NameCoder`
4. fix for above error :
- xstream compile dependency version for spring-oxm 4.0.3.RELEASE  is 1.4.7
  so xstream version should be changed to 1.4.7
- 