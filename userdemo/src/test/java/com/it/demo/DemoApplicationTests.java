package com.it.demo;

import com.it.dao.UserDao;
import com.it.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

   @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void addUser (){
           User user=new User();
           user.setName("yjsdf01");
           user.setAddress("sdfsd");
           SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
         /*  try {
               Date date1 = sdf.parse(sdf.format(new Date(Long.parseLong("1234567"))))
               前台时间戳转换成日期格式
           }catch (Exception e){

           }*/
          /* String sss="2017-07-19";
           sdf.parse(sss)//字符串转日期*/
           Date date=new Date();
           System.out.println("ss===="+sdf.format(date));
           try {
               user.setBirthday(sdf.parse(sdf.format(date)));

           }catch (Exception e){

           }
            userDao.addUser(user);
    }

//    @Test
//  public void listAll() {
//        User user=new  User();
//        String name =user.getName();
//        List<User> users  = userDao.selectAll();
//        users.add(name)
//        System.out.println(users);
//   }



    @Test
    public void selectAll(){
        User users=new User();
        users.setId(77);
       /* for (User user:userDao.selectAll(new User()))*/
        ;
        for(User user:userDao.selectAll(users)){
            System.out.println("id:"+user.getId()+"Name=="+user.getName()+"birthday=="+user.getBirthday()+"getAddress=="+user.getAddress());
            user.setName("djak ");
            user.setAddress("ndskfndskfnskjfnks");
            userDao.udpUser(user);
            System.out.println("id:"+user.getId()+"Name=="+user.getName()+"birthday=="+user.getBirthday()+"getAddress=="+user.getAddress());
        }

    }







}
