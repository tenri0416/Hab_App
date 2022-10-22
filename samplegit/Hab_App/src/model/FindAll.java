package model;

import java.util.List;

import dao.HabDao;
import javaBrans.DateJB;

public class FindAll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HabDao habdao=new HabDao();
		List<DateJB>hubList=habdao.findAll();
		
		for(DateJB hub:hubList) {
			System.out.println("date:"+hub.getDate());
			System.out.println("content"+hub.getContent());
		    System.out.println("money"+hub.getMoney());
		    
		}

	}

}
