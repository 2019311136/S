package ʵ����;
import java.util.Scanner;
public class Test {
	 static final double s1 = 0.03;//<1500
	    static final double s2 = 0.1;//1500<x<4500
	    static final double s3 = 0.2;//4500<x<9000
	    static final double s4 = 0.25;//9000<x<35000
	    static final double s5 = 0.3;//35000<x<55000
	    static final double s6 = 0.35;//55000<x<80000
	    static final double s7 = 0.45;//>80000
	    //����5000
	    static Scanner input = new Scanner(System.in);

	    public static void main(String[] args) {
	        Stu s11 = new Stu();
	        Stu s12 = new Stu();
	        System.out.print("�������һ���о��������룺");
	        s11.setXinshui(input.nextInt());
	        System.out.print("�������һ���о�����ѧ�ѣ�");
	        s11.jiaoxuefei(input.nextInt());
	        //System.out.println(s11.getXinshui());
	        //System.out.println(s11.getXuefei());
	        double chazhi = s11.getXinshui() - s11.getXuefei() - 5000;
	        //System.out.println(chazhi);
	        if (chazhi <= 0) {
	            System.out.println("Ӧ����˰Ϊ��" + 0);
	        } else if (chazhi>0 && chazhi < 1500) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi * s1);
	        } else if (chazhi > 1500 && chazhi < 4500) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi * s2);
	        } else if (chazhi > 4500 && chazhi < 9500) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi * s3);
	        } else if (chazhi > 9500 && chazhi < 35000) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi * s4);
	        } else if (chazhi > 35000 && chazhi < 55000) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi * s5);
	        } else if (chazhi > 55000 && chazhi < 80000) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi * s6);
	        } else if (chazhi > 80000) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi * s7);
	        }


	        //==========================
	        System.out.print("������ڶ����о��������룺");
	        s12.setXinshui(input.nextInt());
	        System.out.print("������ڶ����о�����ѧ�ѣ�");
	        s12.jiaoxuefei(input.nextInt());
	        //System.out.println(s11.getXinshui());
	        //System.out.println(s11.getXuefei());
	        double chazhi2 = s12.getXinshui() - s12.getXuefei() - 5000;
	        //System.out.println(chazhi2);
	        if (chazhi2 <= 0) {
	            System.out.println("Ӧ����˰Ϊ��" + 0);
	        } else if (chazhi2>0 && chazhi2 < 1500) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi2 * s1);
	        } else if (chazhi2 > 1500 && chazhi2 < 4500) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi2 * s2);
	        } else if (chazhi2 > 4500 && chazhi2 < 9500) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi2 * s3);
	        } else if (chazhi2 > 9500 && chazhi2 < 35000) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi2 * s4);
	        } else if (chazhi2 > 35000 && chazhi2 < 55000) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi2 * s5);
	        } else if (chazhi2 > 55000 && chazhi2 < 80000) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi2 * s6);
	        } else if (chazhi2 > 80000) {
	            System.out.println("Ӧ����˰Ϊ��" + chazhi2 * s7);
	        }
	    }
		// TODO Auto-generated method stub

	}


