1.close BeanFactory so that destroy-method can be executed on beans
    * ((ConfigurableBeanFactory)factory).destroySingletons();
  
2. close context so that destroy-method can be executed on beans
    * ((ClassPathXmlApplicationContext)context).registerShutdownHook();
2.BeanPostprocessor runs for each bean
3.BeanFactoryPostProcessor run only once.