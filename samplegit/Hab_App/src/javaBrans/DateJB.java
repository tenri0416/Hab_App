package javaBrans;

public class DateJB {
	private String date;
	private String content;
	private int money;
	
	public DateJB(String d,String c,int m) {
		this.date=d;
		this.content=c;
		this.money=m;
	}
	public String getDate() {return this.date;}
	public String getContent() {return this.content;}
	public int getMoney() {return this.money;}

}
