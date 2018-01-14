package dao;

import idao.ICustomerDao;

public class CustomerDao implements ICustomerDao {
    public boolean getCustomerByAccount(){
        System.out.println("CustomerDao查询数据库");
        return true;
    }
}
