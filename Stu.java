package ʵ����;

public class Stu {
	private String name;
    private String sex;
    private String age;
    private int xuefei;
    private int xinshui;
   public String getName() {
        return name;}
        public void setName(String name) {
        this.name = name;}
      public String getSex() {
        return sex;}
        public void setSex(String sex) {
        this.sex = sex;}
       public String getAge() {
        return age;}
      public void setAge(String age) {
        this.age = age;}
           public int getXuefei() {
        return xuefei;}
       public void setXuefei(int xuefei) {
        this.xuefei = xuefei;}
        public int getXinshui() {
        return xinshui;
    }

    public void setXinshui(int xinshui) {
        this.xinshui = xinshui;
    }
  
    
    public void jiaoxuefei(int xuefei) {
        this.xuefei = xuefei;
    }
   
    public void chaxuefei() {
        System.out.println("ѧ���ǣ�" + this.xuefei);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
