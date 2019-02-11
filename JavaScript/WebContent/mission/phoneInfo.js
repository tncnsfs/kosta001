function PhoneInfo(name, tel){
	//프로퍼티(name, tel) : 지역변수
	//set, get 메소드 추가
	var name = name;
	var tel2 = tel;
	
	this.setName = function(name){
		name = name;
	}
	
	this.getName = function(){
		return name;
	}
	
	this.setTel = function(tel){
		tel2 = tel;
	}
	
	this.getTel = function(){
		return tel2;
	}
	
	this.toString = function(){
		return this.getName() + "\t" + this.getTel();
	}
}









