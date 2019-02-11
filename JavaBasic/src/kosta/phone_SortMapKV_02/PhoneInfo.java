package kosta.phone_SortMapKV_02;

import java.util.HashMap;
import java.util.Map;

//import java.util.ArrayList;

//상태(name, phoneNo, birth) : String
//기능(show) - 출력

import java.util.Scanner;

public class PhoneInfo implements Comparable<PhoneInfo>{
    
String name, phoneNo, birth;
int num;

public PhoneInfo(){}

public PhoneInfo(String name, String phoneNo, String birth) {
     super();
     this.name = name;
     this.phoneNo = phoneNo;
     this.birth = birth;
}


@Override
public int compareTo(PhoneInfo p) {
	
	if(num < p.num){
		return -1;
	}else if(num > p.num){
		return 1;
	}
	return 0;
}

//-------------------------------


@Override
public String toString() {
	return "PhoneInfo [name=" + name + ", phoneNo=" + phoneNo + ", birth=" + birth + "]";
}

//-------------------------------
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}

public String getBirth() {
	return birth;
}

public void setBirth(String birth) {
	this.birth = birth;
}

}



