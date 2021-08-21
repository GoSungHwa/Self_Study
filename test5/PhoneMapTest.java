package ncs.test5;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class PhoneMapTest {
//main 함수 안에서 Phone 타입의
//	객체들을 선언하여 model 을 키
//	로 맵에 저장하고, 맵의 정보를
//	연속 출력처리하고, Properties 를
//	이용해 파일에 저장 시킨다.
	public static void main(String[] args) {
		Map<String,Phone> map=new HashMap<String,Phone>();
		//Phone 객체를 3개 생성하여 맵에 모델을 key로 객체를 저장한다.
		
		//맴에 저장된 객체 정보를 연속 출력한다. -Map.EntrySet<String,Phone>사용할 것
		
		//맵에 저장된 객체 정보를 Properties를 사용해 "Phone.xml"파일에 기록 저장한다.
		map.put("galaxy S7:",new Phone( "galaxy S7",563500,"삼성",7));
		map.put("iphone 6s:",new Phone( "iphone 6s",8400000,"애플",3));
		map.put("G5:",new Phone( "G5",563500,"LG",5));

		try {
			Properties p=new Properties();
			p.load(new FileReader("C:\\z_workspace/phone.xml"));
			for(Map.Entry<String, Phone> entry : map.entrySet()) {
				System.out.println("맵에 저장된 정보는 다음과 같습니다.");
				System.out.println(entry.getKey() + " : " + entry.getValue());
				p.setProperty(entry.getKey().toString(), entry.getValue().toString());
			}
			System.out.println("Phone.xml 파일에 성공적으로 저장되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
