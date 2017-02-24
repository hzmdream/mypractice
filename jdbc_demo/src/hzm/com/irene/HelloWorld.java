package hzm.com.irene;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC HelloWorld
 * @author 侯志明
 * @version 1.82 18 Mar 1999
 * @date 2013-11-9
 */
public class HelloWorld {

	public static void main(String[] args) {
		
		/**
		 * 1.加载驱动
		 */
		//方式一
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("注册驱动失败");
			e.printStackTrace();
		}
		//方式二
		try {
			com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
		} catch (SQLException e) {
			System.out.println("注册驱动失败");
			e.printStackTrace();
		}
		
		/**
		 * 2.获取链接
		 */
		String url = "jdbc:mysql://192.168.79.131:3306/irene?useUnicode=true&characterEncoding=utf8&useServerPrepStmts=true&cachePrepStmts=true&prepStmtCacheSize=50&prepStmtCacheSqlLimit=300";
		String username = "root";
		String password = "root";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection);
		} catch (SQLException e) {
			System.out.println("获取connection链接失败");
			e.printStackTrace();
		}
		
		/**
		 * 3.创建statement(语句的发送器，功能：向数据库发送sql语句)
		 */
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			System.out.println("statement对象获取失败");
			e.printStackTrace();
		}
		/**
		 * 4.执行操作
		 * execute：：true表示第一个返回值是一个ResultSet对象；false表示这是一个更新个数或者没有结果集。 
		 */
		ResultSet queryResult = null;
		try {
			//执行插入
			String sql = "insert into USERSTEST values(3,'houzm','houzm','24','shanxihongtong')";
			//boolean isSuccess = statement.execute(sql);
			//System.out.println("插入是否执行成功："+isSuccess);//成功返回false
			
			
			//执行删除
			//String deleteSql = "delete from USERSTEST where id = 3";
			//boolean deletedIsSuccess = statement.execute(deleteSql);
			//System.out.println("删除是否执行成功："+deletedIsSuccess);//成功返回false
			
			//执行修改
			//String updateSql = "update USERSTEST set username='houzm' where id = 2";
			//boolean updateIsSuccess = statement.execute(updateSql);
			//System.out.println("更新是否执行成功："+updateIsSuccess);
			
			//执行查询
			String selectSql = "select * from USERSTEST";
			//boolean selectIsSuccess = statement.execute(selectSql);
			//System.out.println("查询是否执行成功："+selectIsSuccess);//成功返回true
			queryResult = statement.executeQuery(selectSql);
			System.out.println("queryResult:"+queryResult);
			
			
			/**
			 * 5.处理结果集
			 */
			System.out.println("=============beforeFirst，光标开始位置==============");
			while (queryResult.next()) {//next(),光标向下移动一行，返回true:下一行有记录，返回false:下一行没有记录
				//获取结果集方式一：getXXX(列号)
//				System.out.println(queryResult.getInt(0));//没有0，java.sql.SQLException: Column Index out of range, 0 < 1.
//				System.out.println("id:"+queryResult.getInt(1)
//						+",username:"+queryResult.getString(2)
//						+",password:"+queryResult.getString(3)
//						+",age:"+queryResult.getString(4)
//						+",address:"+queryResult.getString(5));
				//获取结果集方式二：getXXX(列名)
				System.out.println("id:"+queryResult.getInt("id")
						+",username:"+queryResult.getString("username")
						+",password:"+queryResult.getString("password")
						+",age:"+queryResult.getString("age")
						+",address:"+queryResult.getString("address"));
			}
			System.out.println("==============afterLast，光标结束位置===============");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		/**
		 * 6.关闭资源(倒关)
		 */
		if (queryResult!=null) {
			try {
				queryResult.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally{
				if (statement!=null) {
					try {
						statement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}finally{
						if (connection!=null) {
							try {
								connection.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
	}
}
