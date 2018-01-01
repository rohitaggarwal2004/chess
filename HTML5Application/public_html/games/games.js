var easyLevel = "easy"
var hardLevel = "hard"
var currentLevel = easyLevel;


 document.querySelector("#easy").addEventListener("click",function(){
 	currentLevel = easyLevel;
	var list = document.getElementById("div3");
	alert(list.length);
	//list.removeChild(list.firstChild);
	// alert("1")
});


	document.querySelector("#hard").addEventListener("click",function(){
	currentLevel = hardLevel;
 	var parentDiv = _setDiv("row","div3", document.querySelector("div"));
 	 _setDiv("col-lg-3 col-md-3 col-sm-3",null, parentDiv);

 	var childDiv = _setDiv("col-lg-2 col-md-2 col-sm-2", null, parentDiv);
 	_setDiv("rectangle","color1", childDiv);
 	 
 	 childDiv =  _setDiv("col-lg-2 col-md-2 col-sm-2", null, parentDiv);
 	_setDiv("rectangle","color1", childDiv);
 	 
 	childDiv =  _setDiv("col-lg-2 col-md-2 col-sm-2", null, parentDiv);
 	_setDiv("rectangle","color1", childDiv);
 	 
 	 _setDiv("col-lg-3 col-md-3 col-sm-3",null, parentDiv);
});	

	function _setDiv(clazz, id,parentNode)
	{
		var div = document.createElement("div");                       // Create a <p> element
		div.setAttribute("class", clazz);
		if(id!=null)
		{
			div.setAttribute("id", id);	
		}
		parentNode.appendChild(div);

		return div;
	}