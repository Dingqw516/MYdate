/*
��д�������û�ҵ��������
����1���л�ӭ����
��Ҫ2����������ȡ��
����3���������
*/
//����������
import java.util.Scanner;
public class bank
{
		private String name;//����
		private String password;//����
		private double yuer;//���
		private double cunkuan;//���
		//�����޲ι��췽��
		bank(){}
		//��̬��������ӡ��ӭ���
		static void hello(){
			System.out.println("��ӭ����");
		}
		//���췽����ʼ��
	public bank(String name,String password, double yuer, double cunkuan){
		this.name=name;
		this.password=password;
		this.yuer=yuer;
		this.cunkuan=cunkuan-10;		
		System.out.println(name+",�����ɹ������"+this.cunkuan);
	}
		//���
		public void cun(double qian){
			this.yuer=yuer+qian;
			System.out.println("���ɹ��������"+yuer+"Ԫ");
		}
		//ȡ��
		public void qu(double qian){
			if(qian>this.yuer){
				System.out.println("���㣬����ʧ��");
				return ;
			}
			this.yuer-=qian;
			System.out.println("ȡ��ɹ������"+this.yuer);
			System.out.println("��ӭ�´ι���");
		}
}
class bankapp
{
	public static void main(String[] args){
		bank.hello();
		bank  b=new bank("С����","123456",0.0,100.0);
		b.cun(200);
		b.qu(300);
		b.qu(100);
	
	}
}