function showPic(obj) {
	var source = obj.getAttribute("href");
	var placeholder = document.getElementById('placeholder');

	placeholder.setAttribute('src', source);

	var text = obj.getAttribute('title');
	var description = document.getElementById('description');

	if (description.firstChild.nodeType == 3) {
		description.firstChild.nodeValue = text;

	}
	return false;
}


function prepareGallery(){
	var imagegallery = document.getElementById("imagegallery");
	var links = imagegallery.getElementsByTagName("a");
	
	for(var i=0; i<links.length; i++){
		links[i].onclick = function() {
			return showPic(this);
		}
	}
}

window.onload = prepareGallery;
