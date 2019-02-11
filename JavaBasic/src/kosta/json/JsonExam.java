package kosta.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonExam {

	// JsonObject => json code
	// {"name" : "ȫ�浿", "address" : "���굿", "age" : 20}
	public JSONObject createJsonObject() {
		JSONObject obj = new JSONObject();
		obj.put("name", "ȫ�浿");
		obj.put("address", "���굿");
		obj.put("age", 20);

		return obj;
	}

	public JSONObject createJsonObject2() {
		JSONObject obj2 = new JSONObject();
		obj2.put("name", "�ڱ浿");
		obj2.put("address", "����");
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

		// List => json code ��ȯ [{"key": value},{"key": value}]

		List<Member> list = new ArrayList<>();
		list.add(new Member("ȫ�浿", "���굿", 20));
		list.add(new Member("�ڱ浿", "����", 40));

		// list --> jsonCode ��ȯ
		// System.out.println(net.sf.json.JSONArray.fromObject(list).toString());

		// json code => Java Object
		// [{"address":"���굿","age":20,"name":"ȫ�浿"},{"address":"����","age":40,"name":"�ڱ浿"}]

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
