/*
编写银行新用户业务办理程序
需求1：有欢迎操作
需要2：开户，存款，取款
需求3：提醒余额
*/
//创建开户类
import java.util.Scanner;
public class bank
{
		private String name;//姓名
		private String password;//密码
		private double yuer;//余额
		private double cunkuan;//存款
		//定义无参构造方法
		bank(){}
		//静态方法，打印欢迎语句
		static void hello(){
			System.out.println("欢迎光临");
		}
		//构造方法初始化
	public bank(String name,String password, double yuer, double cunkuan){
		this.name=name;
		this.password=password;
		this.yuer=yuer;
		this.cunkuan=cunkuan-10;		
		System.out.println(name+",开户成功，余额"+this.cunkuan);
	}
		//存款
		public void cun(double qian){
			this.yuer=yuer+qian;
			System.out.println("存款成功，余额有"+yuer+"元");
		}
		//取款
		public void qu(double qian){
			if(qian>this.yuer){
				System.out.println("余额不足，操作失败");
				return ;
			}
			this.yuer-=qian;
			System.out.println("取款成功，余额"+this.yuer);
			System.out.println("欢迎下次光临");
		}
}
class bankapp
{
	public static void main(String[] args){
		bank.hello();
		bank  b=new bank("小人物","123456",0.0,100.0);
		b.cun(200);
		b.qu(300);
		b.qu(100);
	
	}
}