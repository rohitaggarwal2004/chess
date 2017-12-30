var count = 5;
var stop = false;
var background = "white";
function click1()
{	
	_click("span1");
}

function click2()
{	
	_click("span2");
}

function _click(id)
{	
	var span = document.getElementById(id);
	if(Number(span.textContent) <count && stop ==false)
	{
		span.textContent = Number(span.textContent) +1;	
		if(Number(span.textContent) == count)
		{
			stop=true;
			span.style.background= "green";
		}
	}
}


function reset()
{	
	document.getElementById("span1").textContent = Number(0);
	document.getElementById("span2").textContent = Number(0);
	document.getElementById("span1").style.background= "white";
	document.getElementById("span2").style.background= "white";
	stop = false;
	background = "white";
}

function blur1()
{	

	count =Number(document.getElementById("name").value);
	document.getElementById("span1").textContent = Number(0);
	document.getElementById("span1").textContent = Number(0);
	document.getElementById("span3").textContent = count;
	document.getElementById("span1").style.background= "white";
	document.getElementById("span2").style.background= "white";	
	stop = false;
	background = "white";
}
