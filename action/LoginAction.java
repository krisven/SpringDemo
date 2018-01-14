package action;

import idao.ICustomerDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LoginAction {
    private ICustomerDao icdao;

    public ICustomerDao getIcdao() {
        return icdao;
    }

    public void setIcdao(ICustomerDao icdao) {
        this.icdao = icdao;
    }

    public void execute(){
        //读取系统中的spring-config.xml文件
        //ApplicationContext context = new FileSystemXmlApplicationContext("/src/spring-config.xml");
        //调用文件并实例化对象
        //ICustomerDao icdao = (ICustomerDao)context.getBean("icdao");
        icdao.getCustomerByAccount();
    }
}
