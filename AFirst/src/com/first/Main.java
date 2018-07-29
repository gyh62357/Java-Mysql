/**
 * 
 */
package com.first;

import java.sql.SQLException;

import com.first.SecondJDBCExample.user;

/**
 * 创建人：Administrator
 * 创建时间：上午9:15:41
 * 所在项目：AFirst
 * 所在包：com.first
 * @version
 */
public class Main {
	public static void main(String args[]) throws SQLException{

		SecondJDBCExample cd=new SecondJDBCExample();

        user user=cd.new user();

        cd.ConnectMysql();

        user.setId(2);//每次测试运行都要改变该数字

        user.setName("郭迎辉");

        user.setPassword("789333");

        user.setEmail("udjdj@163.com");

        cd.upsql="update user set username='we' where userid=5";

        cd.delsql="delete from user where userid=2";

        //cd.InsertSql(user,"kkk");

        cd.InsertSql(user);

        cd.DeletSql(cd.delsql);

        cd.UpdateSql(cd.upsql);

        cd.SelectSql(cd.sql);

        cd.CutConnection(cd.conn);

        }

}
