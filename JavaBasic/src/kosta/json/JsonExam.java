package kosta.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonExam {

	// JsonObject => json code
	// {"name" : "홍길동", "address" : "가산동", "age" : 20}
	public JSONObject createJsonObject() {
		JSONObject obj = new JSONObject();
		obj.put("name", "홍길동");
		obj.put("address", "가산동");
		obj.put("age", 20);

		return obj;
	}

	public JSONObject createJsonObject2() {
		JSONObject obj2 = new JSONObject();
		obj2.put("name", "박길동");
		obj2.put("address", "강남");
		obj2.put("age", 40);

		return obj2;
	}

	public static void main(String[] args) {

		JsonExam exam = new JsonExam();

		JSONObject obj = exam.createJsonObject();
		JSONObject obj2 = exam.createJsonObject2();

		// ====================================
		// System.out.println("result: " + obj.toJSONString());

		JSONArray ja = new JSONArray();
		ja.add(obj);
		ja.add(obj2);

		// ====================================
		// JSONArray => json code
		// System.out.println(ja.toJSONString());

		// List => json code 변환 [{"key": value},{"key": value}]

		List<Member> list = new ArrayList<>();
		list.add(new Member("홍길동", "가산동", 20));
		list.add(new Member("박길동", "강남", 40));

		// list --> jsonCode 변환
		// System.out.println(net.sf.json.JSONArray.fromObject(list).toString());

		// json code => Java Object
		// [{"address":"가산동","age":20,"name":"홍길동"},{"address":"강남","age":40,"name":"박길동"}]

		String jsonCode = net.sf.json.JSONArray.fromObject(list).toString();

		JSONParser parser = new JSONParser();
		Object re = null;

		try {
			re = parser.parse(jsonCode);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (re instanceof JSONArray) {
			JSONArray array = (JSONArray) re;
			Iterator iter = array.iterator();
			List<Member> list2 = new ArrayList<>();

			while (iter.hasNext()) {
				JSONObject jo = (JSONObject) iter.next();
				String name = (String) jo.get("name");
				String address = (String) jo.get("address");
				int age = ((Long) jo.get("age")).intValue();

				list2.add(new Member(name, address, age));
			}

			System.out.println(list2);
		}

	}

}
