package com.kumar.Work;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ClassPathResource res = new ClassPathResource("NewFile.xml");
    	XmlBeanFactory factory = new XmlBeanFactory(res);	
       MethodsFile read =(MethodsFile)factory.getBean("methodsfile");
       read.display2();
    }
}