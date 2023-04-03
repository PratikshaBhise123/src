
package spring_ass;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;



public class Test
{
public static void main(String args[]) {

    Resource r = new ClassPathResource("NewFile.xml");
    BeanFactory fac = new XmlBeanFactory(r);
    Invoice i = (Invoice) fac.getBean("iBean");
    i.disp();
}
}